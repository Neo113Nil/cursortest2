package io.noties.markwon.image.destination;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class a {

    private static class b extends a {
        private b() {
        }

        @Override // io.noties.markwon.image.destination.a
        @NonNull
        public String process(@NonNull String str) {
            return str;
        }
    }

    @NonNull
    public static a noOp() {
        return new b();
    }

    @NonNull
    public abstract String process(@NonNull String str);
}
