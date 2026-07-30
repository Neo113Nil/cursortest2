package cn.hutool.core.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class x {
    private static final char COLUMN_LINE = '|';
    private static final char CORNER = '+';
    private static final char LF = '\n';
    private static final char ROW_LINE = 65293;
    private static final char SPACE = 12288;
    private List<Integer> columnCharNumber;
    private boolean isSBCMode = true;
    private final List<List<String>> headerList = new ArrayList();
    private final List<List<String>> bodyList = new ArrayList();

    public static x create() {
        return new x();
    }

    private void fillBorder(StringBuilder sb) {
        sb.append(CORNER);
        Iterator<Integer> it = this.columnCharNumber.iterator();
        while (it.hasNext()) {
            sb.append(cn.hutool.core.text.l.repeat(ROW_LINE, it.next().intValue() + 2));
            sb.append(CORNER);
        }
        sb.append(LF);
    }

    private void fillColumns(List<String> list, String[] strArr) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String c1Var = cn.hutool.core.util.c1.toString(strArr[i8]);
            if (this.isSBCMode) {
                c1Var = cn.hutool.core.convert.d.toSBC(c1Var);
            }
            list.add(c1Var);
            int length = c1Var.length();
            if (length > this.columnCharNumber.get(i8).intValue()) {
                this.columnCharNumber.set(i8, Integer.valueOf(length));
            }
        }
    }

    private void fillRow(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str = list.get(i8);
            sb.append(SPACE);
            sb.append(str);
            int length = str.length();
            int sbcCount = sbcCount(str);
            if (sbcCount % 2 == 1) {
                sb.append(' ');
            }
            sb.append(SPACE);
            int intValue = this.columnCharNumber.get(i8).intValue();
            for (int i9 = 0; i9 < (intValue - length) + (sbcCount / 2); i9++) {
                sb.append(SPACE);
            }
            sb.append(COLUMN_LINE);
        }
    }

    private void fillRows(StringBuilder sb, List<List<String>> list) {
        for (List<String> list2 : list) {
            sb.append(COLUMN_LINE);
            fillRow(sb, list2);
            sb.append(LF);
        }
    }

    private int sbcCount(String str) {
        int i8 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (str.charAt(i9) < 127) {
                i8++;
            }
        }
        return i8;
    }

    public x addBody(String... strArr) {
        ArrayList arrayList = new ArrayList();
        this.bodyList.add(arrayList);
        fillColumns(arrayList, strArr);
        return this;
    }

    public x addHeader(String... strArr) {
        if (this.columnCharNumber == null) {
            this.columnCharNumber = new ArrayList(Collections.nCopies(strArr.length, 0));
        }
        ArrayList arrayList = new ArrayList();
        fillColumns(arrayList, strArr);
        this.headerList.add(arrayList);
        return this;
    }

    public void print() {
        w.print(toString());
    }

    public x setSBCMode(boolean z7) {
        this.isSBCMode = z7;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        fillBorder(sb);
        fillRows(sb, this.headerList);
        fillBorder(sb);
        fillRows(sb, this.bodyList);
        fillBorder(sb);
        return sb.toString();
    }
}
