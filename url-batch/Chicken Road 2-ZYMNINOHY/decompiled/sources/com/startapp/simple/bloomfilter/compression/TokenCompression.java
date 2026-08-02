package com.startapp.simple.bloomfilter.compression;

/* loaded from: classes.dex */
public interface TokenCompression {
    String compress(String str);

    String decompress(String str);
}
