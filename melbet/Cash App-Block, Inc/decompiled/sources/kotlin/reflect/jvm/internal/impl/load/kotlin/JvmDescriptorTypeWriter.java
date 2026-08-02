package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public class JvmDescriptorTypeWriter<T> {
    public Object jvmCurrentType;
    public int jvmCurrentTypeArrayLevel;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(T t) {
        t.getClass();
        if (this.jvmCurrentType == null) {
            int i = this.jvmCurrentTypeArrayLevel;
            if (i <= 0) {
                this.jvmCurrentType = t;
            } else {
                StringsKt__StringsJVMKt.repeat(i, "[");
                throw null;
            }
        }
    }

    public void writeTypeVariable(Name name, T t) {
        name.getClass();
        t.getClass();
        if (this.jvmCurrentType == null) {
            int i = this.jvmCurrentTypeArrayLevel;
            if (i <= 0) {
                this.jvmCurrentType = t;
            } else {
                StringsKt__StringsJVMKt.repeat(i, "[");
                throw null;
            }
        }
    }
}
