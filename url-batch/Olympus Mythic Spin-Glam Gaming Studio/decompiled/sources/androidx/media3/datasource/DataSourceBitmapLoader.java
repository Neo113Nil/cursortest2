package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

@UnstableApi
/* loaded from: classes13.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final Supplier DEFAULT_EXECUTOR_SERVICE = Suppliers.memoize(new Supplier() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Supplier
        public final Object get() {
            ListeningExecutorService lambda$static$0;
            lambda$static$0 = DataSourceBitmapLoader.lambda$static$0();
            return lambda$static$0;
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final ListeningExecutorService listeningExecutorService;

    @Nullable
    private final BitmapFactory.Options options;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListeningExecutorService lambda$static$0() {
        return MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
    }

    public DataSourceBitmapLoader(Context context) {
        this((ListeningExecutorService) Assertions.checkStateNotNull((ListeningExecutorService) DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    public DataSourceBitmapLoader(ListeningExecutorService listeningExecutorService, DataSource.Factory factory) {
        this(listeningExecutorService, factory, null);
    }

    public DataSourceBitmapLoader(ListeningExecutorService listeningExecutorService, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this.listeningExecutorService = listeningExecutorService;
        this.dataSourceFactory = factory;
        this.options = options;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) throws Exception {
        return BitmapUtil.decode(bArr, bArr.length, this.options);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap lambda$decodeBitmap$1;
                lambda$decodeBitmap$1 = DataSourceBitmapLoader.this.lambda$decodeBitmap$1(bArr);
                return lambda$decodeBitmap$1;
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap lambda$loadBitmap$2;
                lambda$loadBitmap$2 = DataSourceBitmapLoader.this.lambda$loadBitmap$2(uri);
                return lambda$loadBitmap$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options);
    }

    private static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] readToEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(readToEnd, readToEnd.length, options);
        } finally {
            dataSource.close();
        }
    }
}
