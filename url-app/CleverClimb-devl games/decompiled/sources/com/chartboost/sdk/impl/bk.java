package com.chartboost.sdk.impl;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes.dex */
public class bk extends Writer implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f3805a;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public bk() {
        this.f3805a = new StringBuilder();
    }

    public bk(int i) {
        this.f3805a = new StringBuilder(i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) {
        this.f3805a.append(c2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f3805a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f3805a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f3805a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f3805a.append(cArr, i, i2);
        }
    }

    public String toString() {
        return this.f3805a.toString();
    }
}
