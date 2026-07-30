package com.facebook.share;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface Sharer {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Result {
        private final String postId;

        public Result(String str) {
            this.postId = str;
        }

        public final String getPostId() {
            return this.postId;
        }
    }

    boolean getShouldFailOnDataError();

    void setShouldFailOnDataError(boolean z);
}
