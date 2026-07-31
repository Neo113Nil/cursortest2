package com.yandex.div.core.downloader;

import androidx.annotation.NonNull;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes2.dex */
public interface DivDownloader {
    public static final DivDownloader STUB = new DivDownloader() { // from class: n1.a
        @Override // com.yandex.div.core.downloader.DivDownloader
        public final LoadReference downloadPatch(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
            return DivDownloader.a(div2View, str, divPatchDownloadCallback);
        }
    };

    static /* synthetic */ LoadReference a(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
        throw new AssertionError("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
    }

    LoadReference downloadPatch(@NonNull Div2View div2View, @NonNull String str, @NonNull DivPatchDownloadCallback divPatchDownloadCallback);
}
