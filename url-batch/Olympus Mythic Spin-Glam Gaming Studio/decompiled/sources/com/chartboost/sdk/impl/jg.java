package com.chartboost.sdk.impl;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes10.dex */
public final class jg {
    public final Resources a;

    public jg(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.a = resources;
    }

    public final String a(int i) {
        try {
            InputStream openRawResource = this.a.openRawResource(i);
            try {
                Intrinsics.checkNotNull(openRawResource);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
                try {
                    String readText = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(openRawResource, null);
                    return readText;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            xb.b("Raw resource file exception", e);
            return null;
        }
    }
}
