package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivRequestExecutor {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    @Metadata
    public interface Callback {
    }

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata
    public static final class Header {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Header(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }
    }

    @Metadata
    public static final class Request {

        @NotNull
        private final String body;

        @Nullable
        private final List<Header> headers;

        @NotNull
        private final String method;

        @NotNull
        private final Uri url;

        public Request(@NotNull Uri url, @NotNull String method, @Nullable List<Header> list, @NotNull String body) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(body, "body");
            this.url = url;
            this.method = method;
            this.headers = list;
            this.body = body;
        }
    }

    @NotNull
    LoadReference execute(@NotNull Request request, @Nullable Callback callback);
}
