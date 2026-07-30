package com.liulishuo.filedownloader.event;

/* loaded from: classes4.dex */
public abstract class b {
    public Runnable callback = null;
    protected final String id;

    public b(String str) {
        this.id = str;
    }

    public final String getId() {
        return this.id;
    }

    public b(String str, boolean z7) {
        this.id = str;
        if (z7) {
            com.liulishuo.filedownloader.util.d.w(this, "do not handle ORDER any more, %s", str);
        }
    }
}
