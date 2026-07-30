package com.chicken.road.kedbags.nav;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

/* compiled from: Routes.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, d2 = {"Lcom/chicken/road/kedbags/nav/ShellRunLedgerRoute;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class ShellRunLedgerRoute {
    public static final int $stable = 0;
    public static final ShellRunLedgerRoute INSTANCE = new ShellRunLedgerRoute();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.chicken.road.kedbags.nav.ShellRunLedgerRoute$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _init_$_anonymous_;
            _init_$_anonymous_ = ShellRunLedgerRoute._init_$_anonymous_();
            return _init_$_anonymous_;
        }
    });

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellRunLedgerRoute)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -188790631;
    }

    public String toString() {
        return "ShellRunLedgerRoute";
    }

    private ShellRunLedgerRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ObjectSerializer("com.chicken.road.kedbags.nav.ShellRunLedgerRoute", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<ShellRunLedgerRoute> serializer() {
        return get$cachedSerializer();
    }
}
