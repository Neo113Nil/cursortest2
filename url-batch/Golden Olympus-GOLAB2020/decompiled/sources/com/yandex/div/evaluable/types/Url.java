package com.yandex.div.evaluable.types;

import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class Url {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String value;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isValid(String str) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        @NotNull
        /* renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m228fromVcSV9u8(@NotNull String urlString) {
            Intrinsics.checkNotNullParameter(urlString, "urlString");
            if (isValid(urlString)) {
                return Url.m222constructorimpl(urlString);
            }
            throw new IllegalArgumentException("Invalid url " + urlString);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m221boximpl(String str) {
        return new Url(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m222constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m223equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m227unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m224equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m225hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m226toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m223equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m225hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m226toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m227unboximpl() {
        return this.value;
    }
}
