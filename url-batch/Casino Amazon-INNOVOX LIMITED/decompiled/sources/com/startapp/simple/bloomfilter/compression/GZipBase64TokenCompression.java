package com.startapp.simple.bloomfilter.compression;

import com.startapp.simple.bloomfilter.codec.Base64;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public class GZipBase64TokenCompression implements TokenCompression {
    private final StringReplacer replacer;

    public GZipBase64TokenCompression(StringReplacer stringReplacer) {
        this.replacer = stringReplacer;
    }

    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String compress(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(str.getBytes());
            IOUtils.closeQuietly((OutputStream) gZIPOutputStream);
            String replaceToUrl = this.replacer.replaceToUrl(Base64.encodeBase64String(byteArrayOutputStream.toByteArray()));
            IOUtils.closeQuietly((OutputStream) gZIPOutputStream);
            return replaceToUrl;
        } catch (Exception unused2) {
            gZIPOutputStream2 = gZIPOutputStream;
            IOUtils.closeQuietly((OutputStream) gZIPOutputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            IOUtils.closeQuietly((OutputStream) gZIPOutputStream2);
            throw th;
        }
    }

    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String decompress(String str) {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decodeBase64(this.replacer.replaceFromUrl(str))));
            try {
                String iOUtils = IOUtils.toString(gZIPInputStream);
                gZIPInputStream.close();
                IOUtils.closeQuietly((InputStream) gZIPInputStream);
                return iOUtils;
            } catch (Exception unused) {
                IOUtils.closeQuietly((InputStream) gZIPInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream2 = gZIPInputStream;
                IOUtils.closeQuietly((InputStream) gZIPInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            gZIPInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
