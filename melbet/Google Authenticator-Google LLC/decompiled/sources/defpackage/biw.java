package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class biw extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public biw() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
