package com.moyoung.dafit.module.common.utils;

/* loaded from: classes4.dex */
public class v {
    private static final String TAG = "dafit_tag";

    class a extends com.orhanobut.logger.a {
        a(com.orhanobut.logger.b bVar) {
            super(bVar);
        }

        @Override // com.orhanobut.logger.a, com.orhanobut.logger.c
        public boolean isLoggable(int i8, String str) {
            return false;
        }
    }

    public void setup() {
        com.orhanobut.logger.f.addLogAdapter(new a(com.orhanobut.logger.h.newBuilder().showThreadInfo(false).methodCount(2).methodOffset(0).tag(TAG).build()));
    }
}
