package org.objectweb.asm.commons;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class StaticInitMerger extends ClassVisitor {
    private MethodVisitor mergedClinitVisitor;
    private int numClinitMethods;
    private String owner;
    private final String renamedClinitMethodPrefix;

    public StaticInitMerger(String str, ClassVisitor classVisitor) {
        this(589824, str, classVisitor);
    }

    protected StaticInitMerger(int i, String str, ClassVisitor classVisitor) {
        super(i, classVisitor);
        this.renamedClinitMethodPrefix = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        super.visit(i, i2, str, str2, str3, strArr);
        this.owner = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        if ("<clinit>".equals(str)) {
            StringBuilder append = new StringBuilder().append(this.renamedClinitMethodPrefix);
            int i2 = this.numClinitMethods;
            this.numClinitMethods = i2 + 1;
            String sb = append.append(i2).toString();
            MethodVisitor visitMethod = super.visitMethod(10, sb, str2, str3, strArr);
            if (this.mergedClinitVisitor == null) {
                this.mergedClinitVisitor = super.visitMethod(10, str, str2, null, null);
            }
            this.mergedClinitVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.owner, sb, str2, false);
            return visitMethod;
        }
        return super.visitMethod(i, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        MethodVisitor methodVisitor = this.mergedClinitVisitor;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(Opcodes.RETURN);
            this.mergedClinitVisitor.visitMaxs(0, 0);
        }
        super.visitEnd();
    }
}
