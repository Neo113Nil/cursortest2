package io.noties.markwon;

import androidx.annotation.NonNull;
import io.noties.markwon.l;

/* loaded from: classes4.dex */
abstract class m {

    class a extends m {
        final /* synthetic */ l.b val$builder;
        final /* synthetic */ g val$configuration;

        a(l.b bVar, g gVar) {
            this.val$builder = bVar;
            this.val$configuration = gVar;
        }

        @Override // io.noties.markwon.m
        @NonNull
        l create() {
            return this.val$builder.build(this.val$configuration, new r());
        }
    }

    m() {
    }

    @NonNull
    static m create(@NonNull l.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    abstract l create();
}
