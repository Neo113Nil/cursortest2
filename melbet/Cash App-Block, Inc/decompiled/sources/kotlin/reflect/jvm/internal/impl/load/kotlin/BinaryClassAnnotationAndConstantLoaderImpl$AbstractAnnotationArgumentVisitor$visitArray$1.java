package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* loaded from: classes9.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
    public final /* synthetic */ Name $name;
    public final ArrayList elements = new ArrayList();
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl this$0;
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor this$1;

    public BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl;
        this.$name = name;
        this.this$1 = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visit(Object obj) {
        this.elements.add(BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(this.this$0, this.$name, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
        classId.getClass();
        final ArrayList arrayList = new ArrayList();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        sourceElement.getClass();
        final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 loadAnnotation = this.this$0.loadAnnotation(classId, sourceElement, arrayList);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 $$delegate_0;
            public final /* synthetic */ ArrayList $list;
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 this$0;

            {
                this.this$0 = this;
                this.$list = arrayList;
                this.$$delegate_0 = BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1.this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visit(Name name, Object obj) {
                visit(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId2) {
                classId2.getClass();
                return visitAnnotation(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
                return visitArray(name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
                classLiteralValue.getClass();
                visitClassLiteral(name, classLiteralValue);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                ArrayList arrayList2;
                visitEnd();
                arrayList2 = this.this$0.elements;
                arrayList2.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.$list)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnum(Name name, ClassId classId2, Name name2) {
                classId2.getClass();
                name2.getClass();
                visitEnum(name, classId2, name2);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
        classLiteralValue.getClass();
        this.elements.add(new KClassValue(classLiteralValue));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnd() {
        this.this$1.visitArrayValue(this.$name, this.elements);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnum(ClassId classId, Name name) {
        classId.getClass();
        name.getClass();
        this.elements.add(new EnumValue(classId, name));
    }
}
