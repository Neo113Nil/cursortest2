package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class g3 {
    public static final a c = new a(null);
    public final Object a;
    public final CBError b;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public final g3 a(Object obj) {
            return new g3(obj, null, 0 == true ? 1 : 0);
        }

        public final g3 a(CBError cBError) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new g3(defaultConstructorMarker, cBError, defaultConstructorMarker);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final g3 a(CBError cBError) {
        return c.a(cBError);
    }

    public g3(Object obj, CBError cBError) {
        this.a = obj;
        this.b = cBError;
    }

    public /* synthetic */ g3(Object obj, CBError cBError, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cBError);
    }
}
