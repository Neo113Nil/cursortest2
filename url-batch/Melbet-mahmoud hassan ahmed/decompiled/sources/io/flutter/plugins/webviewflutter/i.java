package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class i implements k.h {

    /* renamed from: a, reason: collision with root package name */
    final h f17667a;

    public i(h hVar) {
        this.f17667a = hVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.h
    public String a(String str) {
        return this.f17667a.a(str);
    }

    @Override // io.flutter.plugins.webviewflutter.k.h
    public List<String> b(String str) {
        try {
            String[] b7 = this.f17667a.b(str);
            return b7 == null ? new ArrayList() : Arrays.asList(b7);
        } catch (IOException e7) {
            throw new RuntimeException(e7.getMessage());
        }
    }
}
