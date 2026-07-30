package com.google.android.exoplayer2.upstream;

@Deprecated
/* loaded from: classes3.dex */
public interface LoaderErrorThrower {

    public static final class Placeholder implements LoaderErrorThrower {
        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i8) {
        }
    }

    void maybeThrowError();

    void maybeThrowError(int i8);
}
