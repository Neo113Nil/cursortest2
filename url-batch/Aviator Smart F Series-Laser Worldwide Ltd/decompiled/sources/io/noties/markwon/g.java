package io.noties.markwon;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class g {
    private final io.noties.markwon.image.b asyncDrawableLoader;
    private final io.noties.markwon.image.destination.a imageDestinationProcessor;
    private final io.noties.markwon.image.g imageSizeResolver;
    private final c linkResolver;
    private final j spansFactory;
    private final w5.a syntaxHighlight;
    private final io.noties.markwon.core.b theme;

    public static class b {
        private io.noties.markwon.image.b asyncDrawableLoader;
        private io.noties.markwon.image.destination.a imageDestinationProcessor;
        private io.noties.markwon.image.g imageSizeResolver;
        private c linkResolver;
        private j spansFactory;
        private w5.a syntaxHighlight;
        private io.noties.markwon.core.b theme;

        b() {
        }

        @NonNull
        public b asyncDrawableLoader(@NonNull io.noties.markwon.image.b bVar) {
            this.asyncDrawableLoader = bVar;
            return this;
        }

        @NonNull
        public g build(@NonNull io.noties.markwon.core.b bVar, @NonNull j jVar) {
            this.theme = bVar;
            this.spansFactory = jVar;
            if (this.asyncDrawableLoader == null) {
                this.asyncDrawableLoader = io.noties.markwon.image.b.noOp();
            }
            if (this.syntaxHighlight == null) {
                this.syntaxHighlight = new w5.b();
            }
            if (this.linkResolver == null) {
                this.linkResolver = new d();
            }
            if (this.imageDestinationProcessor == null) {
                this.imageDestinationProcessor = io.noties.markwon.image.destination.a.noOp();
            }
            if (this.imageSizeResolver == null) {
                this.imageSizeResolver = new io.noties.markwon.image.h();
            }
            return new g(this);
        }

        @NonNull
        public b imageDestinationProcessor(@NonNull io.noties.markwon.image.destination.a aVar) {
            this.imageDestinationProcessor = aVar;
            return this;
        }

        @NonNull
        public b imageSizeResolver(@NonNull io.noties.markwon.image.g gVar) {
            this.imageSizeResolver = gVar;
            return this;
        }

        @NonNull
        public b linkResolver(@NonNull c cVar) {
            this.linkResolver = cVar;
            return this;
        }

        @NonNull
        public b syntaxHighlight(@NonNull w5.a aVar) {
            this.syntaxHighlight = aVar;
            return this;
        }
    }

    @NonNull
    public static b builder() {
        return new b();
    }

    @NonNull
    public io.noties.markwon.image.b asyncDrawableLoader() {
        return this.asyncDrawableLoader;
    }

    @NonNull
    public io.noties.markwon.image.destination.a imageDestinationProcessor() {
        return this.imageDestinationProcessor;
    }

    @NonNull
    public io.noties.markwon.image.g imageSizeResolver() {
        return this.imageSizeResolver;
    }

    @NonNull
    public c linkResolver() {
        return this.linkResolver;
    }

    @NonNull
    public j spansFactory() {
        return this.spansFactory;
    }

    @NonNull
    public w5.a syntaxHighlight() {
        return this.syntaxHighlight;
    }

    @NonNull
    public io.noties.markwon.core.b theme() {
        return this.theme;
    }

    private g(@NonNull b bVar) {
        this.theme = bVar.theme;
        this.asyncDrawableLoader = bVar.asyncDrawableLoader;
        this.syntaxHighlight = bVar.syntaxHighlight;
        this.linkResolver = bVar.linkResolver;
        this.imageDestinationProcessor = bVar.imageDestinationProcessor;
        this.imageSizeResolver = bVar.imageSizeResolver;
        this.spansFactory = bVar.spansFactory;
    }
}
