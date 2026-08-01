package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* loaded from: classes.dex */
public class LocalVariablesSorter extends MethodVisitor {
    private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    protected final int firstLocal;
    protected int nextLocal;
    private Object[] remappedLocalTypes;
    private int[] remappedVariableIndices;

    protected void setLocalType(int i, Type type) {
    }

    protected void updateNewLocals(Object[] objArr) {
    }

    public LocalVariablesSorter(int i, String str, MethodVisitor methodVisitor) {
        this(589824, i, str, methodVisitor);
        if (getClass() != LocalVariablesSorter.class) {
            throw new IllegalStateException();
        }
    }

    protected LocalVariablesSorter(int i, int i2, String str, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.remappedVariableIndices = new int[40];
        this.remappedLocalTypes = new Object[20];
        int i3 = i2 & 8;
        this.nextLocal = i3 == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str)) {
            this.nextLocal += type.getSize();
        }
        this.firstLocal = this.nextLocal;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // org.objectweb.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitVarInsn(int i, int i2) {
        Type type;
        if (i != 169) {
            switch (i) {
                case 21:
                    type = Type.INT_TYPE;
                    super.visitVarInsn(i, remap(i2, type));
                case 22:
                    type = Type.LONG_TYPE;
                    super.visitVarInsn(i, remap(i2, type));
                case 23:
                    type = Type.FLOAT_TYPE;
                    super.visitVarInsn(i, remap(i2, type));
                case 24:
                    type = Type.DOUBLE_TYPE;
                    super.visitVarInsn(i, remap(i2, type));
                case 25:
                    break;
                default:
                    switch (i) {
                        case 54:
                            break;
                        case 55:
                            break;
                        case 56:
                            break;
                        case 57:
                            break;
                        case 58:
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid opcode " + i);
                    }
                    super.visitVarInsn(i, remap(i2, type));
            }
        }
        type = OBJECT_TYPE;
        super.visitVarInsn(i, remap(i2, type));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        super.visitIincInsn(remap(i, Type.INT_TYPE), i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        super.visitMaxs(i, this.nextLocal);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        super.visitLocalVariable(str, str2, str3, label, label2, remap(i, Type.getType(str2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        Type type = Type.getType(str);
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = remap(iArr[i2], type);
        }
        return super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        Object obj;
        if (i != -1) {
            throw new IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        Object[] objArr3 = this.remappedLocalTypes;
        int length = objArr3.length;
        Object[] objArr4 = new Object[length];
        int i4 = 0;
        System.arraycopy(objArr3, 0, objArr4, 0, length);
        updateNewLocals(this.remappedLocalTypes);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 2;
            if (i5 >= i2) {
                break;
            }
            Object obj2 = objArr[i5];
            if (obj2 != Opcodes.TOP) {
                Type type = OBJECT_TYPE;
                if (obj2 == Opcodes.INTEGER) {
                    type = Type.INT_TYPE;
                } else if (obj2 == Opcodes.FLOAT) {
                    type = Type.FLOAT_TYPE;
                } else if (obj2 == Opcodes.LONG) {
                    type = Type.LONG_TYPE;
                } else if (obj2 == Opcodes.DOUBLE) {
                    type = Type.DOUBLE_TYPE;
                } else if (obj2 instanceof String) {
                    type = Type.getObjectType((String) obj2);
                }
                setFrameLocal(remap(i6, type), obj2);
            }
            if (obj2 != Opcodes.LONG && obj2 != Opcodes.DOUBLE) {
                i7 = 1;
            }
            i6 += i7;
            i5++;
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            while (true) {
                Object[] objArr5 = this.remappedLocalTypes;
                if (i4 < objArr5.length) {
                    obj = objArr5[i4];
                    i4 += (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? 2 : 1;
                    if (obj == null || obj == Opcodes.TOP) {
                        this.remappedLocalTypes[i8] = Opcodes.TOP;
                        i8++;
                    }
                } else {
                    super.visitFrame(i, i9, objArr5, i3, objArr2);
                    this.remappedLocalTypes = objArr4;
                    return;
                }
            }
            this.remappedLocalTypes[i8] = obj;
            i8++;
        }
    }

    public int newLocal(Type type) {
        Object obj;
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                obj = Opcodes.INTEGER;
                break;
            case 6:
                obj = Opcodes.FLOAT;
                break;
            case 7:
                obj = Opcodes.LONG;
                break;
            case 8:
                obj = Opcodes.DOUBLE;
                break;
            case 9:
                obj = type.getDescriptor();
                break;
            case 10:
                obj = type.getInternalName();
                break;
            default:
                throw new AssertionError();
        }
        int newLocalMapping = newLocalMapping(type);
        setLocalType(newLocalMapping, type);
        setFrameLocal(newLocalMapping, obj);
        return newLocalMapping;
    }

    private void setFrameLocal(int i, Object obj) {
        int length = this.remappedLocalTypes.length;
        if (i >= length) {
            Object[] objArr = new Object[Math.max(length * 2, i + 1)];
            System.arraycopy(this.remappedLocalTypes, 0, objArr, 0, length);
            this.remappedLocalTypes = objArr;
        }
        this.remappedLocalTypes[i] = obj;
    }

    private int remap(int i, Type type) {
        if (type.getSize() + i <= this.firstLocal) {
            return i;
        }
        int size = ((i * 2) + type.getSize()) - 1;
        int length = this.remappedVariableIndices.length;
        if (size >= length) {
            int[] iArr = new int[Math.max(length * 2, size + 1)];
            System.arraycopy(this.remappedVariableIndices, 0, iArr, 0, length);
            this.remappedVariableIndices = iArr;
        }
        int i2 = this.remappedVariableIndices[size];
        if (i2 != 0) {
            return i2 - 1;
        }
        int newLocalMapping = newLocalMapping(type);
        setLocalType(newLocalMapping, type);
        this.remappedVariableIndices[size] = newLocalMapping + 1;
        return newLocalMapping;
    }

    protected int newLocalMapping(Type type) {
        int i = this.nextLocal;
        this.nextLocal = type.getSize() + i;
        return i;
    }
}
