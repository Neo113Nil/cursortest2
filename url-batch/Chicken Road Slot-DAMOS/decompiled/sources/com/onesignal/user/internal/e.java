package com.onesignal.user.internal;

import dd.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends b {
    public static final a Companion = new a(null);

    public e() {
        super(Companion.createFakePushSub());
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dd.d createFakePushSub() {
            dd.d dVar = new dd.d();
            dVar.setId("");
            dVar.setType(g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }

        private a() {
        }
    }
}
