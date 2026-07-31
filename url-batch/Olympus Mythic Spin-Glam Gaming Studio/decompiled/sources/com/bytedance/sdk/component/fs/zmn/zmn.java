package com.bytedance.sdk.component.fs.zmn;

/* loaded from: classes3.dex */
public final class zmn {
    public final boolean zmn;

    zmn(C0131zmn c0131zmn) {
        this.zmn = c0131zmn.zmn;
    }

    /* renamed from: com.bytedance.sdk.component.fs.zmn.zmn$zmn, reason: collision with other inner class name */
    public static final class C0131zmn {
        boolean zmn;

        public C0131zmn zmn() {
            this.zmn = true;
            return this;
        }

        public zmn fs() {
            return new zmn(this);
        }
    }
}
