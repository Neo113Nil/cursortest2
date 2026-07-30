package com.yanzhenjie.kalle.connect;

/* loaded from: classes4.dex */
public interface d {
    public static final d DEFAULT = new a();

    static class a implements d {
        a() {
        }

        @Override // com.yanzhenjie.kalle.connect.d
        public boolean isAvailable() {
            return true;
        }
    }

    boolean isAvailable();
}
