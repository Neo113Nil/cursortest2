package r4;

import com.google.android.exoplayer2.util.MimeTypes;
import com.yanzhenjie.kalle.i;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
public final class c {
    private static final MediaType FORM;
    private static final MediaType GIF;
    private static final MediaType HTML;
    private static final MediaType IMG;
    public static final c INSTANCE = new c();
    private static final MediaType JPEG;
    private static final MediaType JSON;
    private static final MediaType MP4;
    private static final MediaType OCTET_STREAM;
    private static final MediaType PNG;
    private static final MediaType TXT;
    private static final MediaType URLENCODED;
    private static final MediaType XML;

    static {
        MediaType.Companion companion = MediaType.Companion;
        IMG = companion.get(com.crrepa.x.a.f13978d);
        GIF = companion.get("image/gif");
        JPEG = companion.get(MimeTypes.IMAGE_JPEG);
        PNG = companion.get(MimeTypes.IMAGE_PNG);
        MP4 = companion.get(MimeTypes.VIDEO_MPEG);
        TXT = companion.get("text/plain");
        JSON = companion.get("application/json; charset=utf-8");
        XML = companion.get(i.VALUE_APPLICATION_XML);
        HTML = companion.get("text/html");
        FORM = companion.get(i.VALUE_APPLICATION_FORM);
        OCTET_STREAM = companion.get("application/octet-stream");
        URLENCODED = companion.get(i.VALUE_APPLICATION_URLENCODED);
    }

    private c() {
    }

    public final MediaType getFORM() {
        return FORM;
    }

    public final MediaType getGIF() {
        return GIF;
    }

    public final MediaType getHTML() {
        return HTML;
    }

    public final MediaType getIMG() {
        return IMG;
    }

    public final MediaType getJPEG() {
        return JPEG;
    }

    public final MediaType getJSON() {
        return JSON;
    }

    public final MediaType getMP4() {
        return MP4;
    }

    public final MediaType getOCTET_STREAM() {
        return OCTET_STREAM;
    }

    public final MediaType getPNG() {
        return PNG;
    }

    public final MediaType getTXT() {
        return TXT;
    }

    public final MediaType getURLENCODED() {
        return URLENCODED;
    }

    public final MediaType getXML() {
        return XML;
    }
}
