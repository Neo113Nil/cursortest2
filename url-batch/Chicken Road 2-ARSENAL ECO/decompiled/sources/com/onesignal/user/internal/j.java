package com.onesignal.user.internal;

/* loaded from: classes.dex */
public final class j extends g {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final w3.d createFakePushSub() {
            w3.d dVar = new w3.d();
            dVar.setId("");
            dVar.setType(w3.g.PUSH);
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
