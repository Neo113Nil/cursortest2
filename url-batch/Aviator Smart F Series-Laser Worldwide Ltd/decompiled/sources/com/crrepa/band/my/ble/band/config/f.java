package com.crrepa.band.my.ble.band.config;

import android.content.Context;
import com.crrepa.band.my.model.net.BandConfigEntity;
import com.crrepa.band.my.model.net.BandLanguageEntity;
import com.moyoung.dafit.module.common.utils.m0;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class f {
    private static final String BAND_CONFIG_FILE_NAME = "config.txt";
    private static final String BAND_LANGUAGE_FILE_NAME = "language.txt";

    class a implements ObservableOnSubscribe {
        final /* synthetic */ Context val$context;

        a(Context context) {
            this.val$context = context;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<BandLanguageEntity> observableEmitter) {
            InputStream localBandConfig = f.this.getLocalBandConfig(this.val$context, f.BAND_LANGUAGE_FILE_NAME);
            if (localBandConfig == null) {
                observableEmitter.onComplete();
                return;
            }
            BandLanguageEntity bandLanguageEntity = (BandLanguageEntity) s.reader2Bean(new InputStreamReader(localBandConfig), BandLanguageEntity.class);
            if (bandLanguageEntity != null) {
                observableEmitter.onNext(bandLanguageEntity);
            }
            observableEmitter.onComplete();
        }
    }

    class b implements ObservableOnSubscribe {
        final /* synthetic */ Context val$context;

        b(Context context) {
            this.val$context = context;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<BandConfigEntity> observableEmitter) {
            InputStream localBandConfig = f.this.getLocalBandConfig(this.val$context, f.BAND_CONFIG_FILE_NAME);
            if (localBandConfig == null) {
                observableEmitter.onComplete();
                return;
            }
            BandConfigEntity bandConfigEntity = (BandConfigEntity) s.reader2Bean(new InputStreamReader(localBandConfig), BandConfigEntity.class);
            if (bandConfigEntity != null) {
                observableEmitter.onNext(bandConfigEntity);
            }
            observableEmitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getLocalBandConfig(Context context, String str) {
        try {
            byte[] decrypt = new e5.a().decrypt(m0.readStream(context.getAssets().open(str)));
            if (decrypt != null) {
                return m0.byteTOInputStream(decrypt);
            }
            return null;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public Observable<BandConfigEntity> readBandConfig(Context context) {
        return Observable.create(new b(context));
    }

    public Observable<BandLanguageEntity> readBandLanguage(Context context) {
        return Observable.create(new a(context));
    }
}
