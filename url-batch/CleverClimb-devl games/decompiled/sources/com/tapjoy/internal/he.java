package com.tapjoy.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    private final File f8263a;

    public he(File file) {
        this.f8263a = file;
    }

    public final synchronized boolean a() {
        if (b() != null) {
            return false;
        }
        try {
            File file = this.f8263a;
            String uuid = UUID.randomUUID().toString();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bg.a(fileOutputStream, uuid);
                return b() != null;
            } finally {
                ka.a(fileOutputStream);
            }
        } catch (IOException e) {
            try {
                this.f8263a.delete();
                throw e;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Nullable
    final String b() {
        if (!this.f8263a.exists()) {
            return null;
        }
        try {
            String a2 = bg.a(this.f8263a, ak.f7827c);
            if (a2.length() > 0) {
                return a2;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
