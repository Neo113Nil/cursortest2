package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.google.mlkit.vision.barcode.BarcodeScanning;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

/* loaded from: classes9.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {
    public final Object recordComponent;

    public ReflectJavaRecordComponent(Object obj) {
        obj.getClass();
        this.recordComponent = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member getMember() {
        Object obj = this.recordComponent;
        obj.getClass();
        Java16RecordComponentsLoader$Cache java16RecordComponentsLoader$Cache = BarcodeScanning._cache;
        Method method = null;
        if (java16RecordComponentsLoader$Cache == null) {
            Class<?> cls = obj.getClass();
            try {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(null, null);
            }
            BarcodeScanning._cache = java16RecordComponentsLoader$Cache;
        }
        Method getAccessor = java16RecordComponentsLoader$Cache.getGetAccessor();
        if (getAccessor != null) {
            Object invoke = getAccessor.invoke(obj, null);
            invoke.getClass();
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public JavaType getType() {
        Object obj = this.recordComponent;
        obj.getClass();
        Java16RecordComponentsLoader$Cache java16RecordComponentsLoader$Cache = BarcodeScanning._cache;
        Class cls = null;
        if (java16RecordComponentsLoader$Cache == null) {
            Class<?> cls2 = obj.getClass();
            try {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(null, null);
            }
            BarcodeScanning._cache = java16RecordComponentsLoader$Cache;
        }
        Method getType = java16RecordComponentsLoader$Cache.getGetType();
        if (getType != null) {
            Object invoke = getType.invoke(obj, null);
            invoke.getClass();
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new ReflectJavaClassifierType(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean isVararg() {
        return false;
    }
}
