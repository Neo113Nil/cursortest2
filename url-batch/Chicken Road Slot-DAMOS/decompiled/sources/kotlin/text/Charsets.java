package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0084\b\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0084\b\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0084\b\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0084\b\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0084\b\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0084\b\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000R#\u0010\f\u001a\u00020\u00058GX\u0086\u0084\bz\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\r¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0082\u008e\b¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u00020\u00058GX\u0086\u0084\bz\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u008e\b¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\u00020\u00058GX\u0086\u0084\bz\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0082\u008e\b¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "UTF_8", "Ljava/nio/charset/Charset;", "Lkotlin/jvm/JvmField;", "UTF_16", "UTF_16BE", "UTF_16LE", "US_ASCII", "ISO_8859_1", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "Lkotlin/jvm/JvmName;", "name", "utf_32", "UTF_32LE", "UTF32_LE", "utf_32le", "UTF_32BE", "UTF32_BE", "utf_32be", "kotlin-stdlib"}, k = 1, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Charsets {
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public static final Charsets f5603a = new Charsets();

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        UTF_8 = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
