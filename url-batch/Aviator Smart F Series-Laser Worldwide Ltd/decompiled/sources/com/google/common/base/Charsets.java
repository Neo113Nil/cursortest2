package com.google.common.base;

import cn.hutool.core.util.l;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Charsets {

    @GwtIncompatible
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName(l.ISO_8859_1);
    public static final Charset UTF_8 = Charset.forName(l.UTF_8);

    @GwtIncompatible
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

    @GwtIncompatible
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

    @GwtIncompatible
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    private Charsets() {
    }
}
