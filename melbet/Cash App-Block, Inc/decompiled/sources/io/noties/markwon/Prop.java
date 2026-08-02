package io.noties.markwon;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class Prop {
    public final String name;

    public Prop(String str) {
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Prop.class != obj.getClass()) {
            return false;
        }
        return this.name.equals(((Prop) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final Object require(RenderPropsImpl renderPropsImpl) {
        Object obj = renderPropsImpl.values.get(this);
        if (obj != null) {
            return obj;
        }
        a$$ExternalSyntheticBUOutline0.m$2(this.name);
        return null;
    }

    public final void set(RenderPropsImpl renderPropsImpl, Object obj) {
        HashMap hashMap = renderPropsImpl.values;
        if (obj == null) {
            hashMap.remove(this);
        } else {
            hashMap.put(this, obj);
        }
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Prop{name='"), this.name, "'}");
    }
}
