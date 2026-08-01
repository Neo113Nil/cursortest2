package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.AbstractInsnNode;

/* loaded from: classes.dex */
public class AnalyzerException extends Exception {
    private static final long serialVersionUID = 3154190448018943333L;
    public final transient AbstractInsnNode node;

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str) {
        super(str);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Throwable th) {
        super(str, th);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Object obj, Value value) {
        super((str == null ? "Expected " : str + ": expected ") + obj + ", but found " + value);
        this.node = abstractInsnNode;
    }
}
