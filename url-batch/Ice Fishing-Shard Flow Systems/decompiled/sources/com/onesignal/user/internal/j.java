package com.onesignal.user.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j extends g {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Y3.d createFakePushSub() {
            Y3.d dVar = new Y3.d();
            dVar.setId("");
            dVar.setType(Y3.g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }

        private a() {
        }
    }

    public j() {
        super(Companion.createFakePushSub());
    }
}
