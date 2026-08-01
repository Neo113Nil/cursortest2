package org.jacoco.core.internal.analysis.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.BitSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes.dex */
public final class KotlinInlineFilter implements IFilter {
    private int firstGeneratedLineNumber = -1;
    private static final Pattern LINE_INFO_PATTERN = Pattern.compile("([0-9]++)(#[0-9]++)?+(,[0-9]++)?+:([0-9]++)(,[0-9]++)?+");
    private static final Pattern FILE_INFO_PATTERN = Pattern.compile("\\+ ([0-9]++) (.++)");

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceDebugExtension() != null && KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (this.firstGeneratedLineNumber == -1) {
                this.firstGeneratedLineNumber = getFirstGeneratedLineNumber(iFilterContext.getSourceFileName(), iFilterContext.getSourceDebugExtension());
            }
            Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
            int i = 0;
            while (it.hasNext()) {
                AbstractInsnNode next = it.next();
                if (15 == next.getType()) {
                    i = ((LineNumberNode) next).line;
                }
                if (i >= this.firstGeneratedLineNumber) {
                    iFilterOutput.ignore(next, next);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getFirstGeneratedLineNumber(String str, String str2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str2));
            expectLine(bufferedReader, "SMAP");
            expectLine(bufferedReader, str);
            expectLine(bufferedReader, "Kotlin");
            expectLine(bufferedReader, "*S Kotlin");
            expectLine(bufferedReader, "*F");
            BitSet bitSet = new BitSet();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (!"*L".equals(readLine)) {
                    bufferedReader.readLine();
                    Matcher matcher = FILE_INFO_PATTERN.matcher(readLine);
                    if (!matcher.matches()) {
                        throw new IllegalStateException("Unexpected SMAP line: " + readLine);
                    }
                    if (matcher.group(2).equals(str)) {
                        bitSet.set(Integer.parseInt(matcher.group(1)));
                    }
                } else if (!bitSet.isEmpty()) {
                    int i = Integer.MAX_VALUE;
                    while (true) {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2.equals("*E") || readLine2.equals("*S KotlinDebug")) {
                            break;
                        }
                        Matcher matcher2 = LINE_INFO_PATTERN.matcher(readLine2);
                        if (!matcher2.matches()) {
                            throw new IllegalStateException("Unexpected SMAP line: " + readLine2);
                        }
                        int parseInt = Integer.parseInt(matcher2.group(1));
                        int parseInt2 = Integer.parseInt(matcher2.group(2).substring(1));
                        int parseInt3 = Integer.parseInt(matcher2.group(4));
                        if (!bitSet.get(parseInt2) || parseInt != parseInt3) {
                            i = Math.min(parseInt3, i);
                        }
                    }
                } else {
                    throw new IllegalStateException("Unexpected SMAP FileSection");
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static void expectLine(BufferedReader bufferedReader, String str) throws IOException {
        String readLine = bufferedReader.readLine();
        if (!str.equals(readLine)) {
            throw new IllegalStateException("Unexpected SMAP line: " + readLine);
        }
    }
}
