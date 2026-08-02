package com.withpersona.sdk2.inquiry.internal.fallbackmode;

/* loaded from: classes9.dex */
public interface ApiControllerParams {

    public final class Fallback implements ApiControllerParams {
        public static final Fallback INSTANCE = new Fallback();
    }

    public final class Offline implements ApiControllerParams {
        public final int staticTemplateResourceId;

        public Offline(int i) {
            this.staticTemplateResourceId = i;
        }
    }
}
