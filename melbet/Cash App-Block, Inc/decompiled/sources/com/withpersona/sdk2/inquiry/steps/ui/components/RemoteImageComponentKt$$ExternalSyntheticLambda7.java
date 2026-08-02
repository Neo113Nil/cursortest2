package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcelable;
import coil3.RealImageLoader;
import coil3.decode.Decoder;
import coil3.decode.ImageSourceKt;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import coil3.svg.SvgDecoder;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import okio.Buffer;

/* loaded from: classes9.dex */
public final /* synthetic */ class RemoteImageComponentKt$$ExternalSyntheticLambda7 implements Decoder.Factory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Parcelable f$0;

    public /* synthetic */ RemoteImageComponentKt$$ExternalSyntheticLambda7(Parcelable parcelable, int i) {
        this.$r8$classId = i;
        this.f$0 = parcelable;
    }

    @Override // coil3.decode.Decoder.Factory
    public final Decoder create(SourceFetchResult sourceFetchResult, Options options, RealImageLoader realImageLoader) {
        int i = this.$r8$classId;
        Parcelable parcelable = this.f$0;
        switch (i) {
            case 0:
                sourceFetchResult.getClass();
                options.getClass();
                byte[] readByteArray = sourceFetchResult.source.source().readByteArray();
                Charset charset = Charsets.UTF_8;
                byte[] bytes = RemoteImageComponentKt.getColorReplacedSvg(new String(readByteArray, charset), (RemoteImage.RemoteImageComponentStyle) parcelable).getBytes(charset);
                bytes.getClass();
                Buffer buffer = new Buffer();
                buffer.write(bytes, 0, bytes.length);
                return new SvgDecoder(ImageSourceKt.ImageSource$default(buffer, options.fileSystem), options);
            default:
                sourceFetchResult.getClass();
                options.getClass();
                byte[] readByteArray2 = sourceFetchResult.source.source().readByteArray();
                Charset charset2 = Charsets.UTF_8;
                byte[] bytes2 = RemoteImageComponentKt.getColorReplacedSvg(new String(readByteArray2, charset2), ((RemoteImage) parcelable).getStyles()).getBytes(charset2);
                bytes2.getClass();
                Buffer buffer2 = new Buffer();
                buffer2.write(bytes2, 0, bytes2.length);
                return new SvgDecoder(ImageSourceKt.ImageSource$default(buffer2, options.fileSystem), options);
        }
    }
}
