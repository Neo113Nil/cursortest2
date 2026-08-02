package com.squareup.cash.storage.context;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class KeyedStorageContextWrapper extends ContextWrapper {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy cacheDirFile$delegate;
    public final Lazy filesDirFile$delegate;
    public final String key;

    public static File $r8$lambda$bA08Axf3hnIoLixvhVzbSyZ00pE(KeyedStorageContextWrapper keyedStorageContextWrapper) {
        File filesDir = super.getFilesDir();
        filesDir.getClass();
        File resolve = FilesKt__UtilsKt.resolve(filesDir, keyedStorageContextWrapper.key);
        resolve.mkdirs();
        return resolve;
    }

    public static File $r8$lambda$bmDZELm0i5Cq7N3_D2O3_CncfjQ(KeyedStorageContextWrapper keyedStorageContextWrapper) {
        File cacheDir = super.getCacheDir();
        cacheDir.getClass();
        File resolve = FilesKt__UtilsKt.resolve(cacheDir, keyedStorageContextWrapper.key);
        resolve.mkdirs();
        return resolve;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedStorageContextWrapper(Context context, String str) {
        super(context);
        str.getClass();
        this.key = str;
        final int i = 0;
        this.cacheDirFile$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.storage.context.KeyedStorageContextWrapper$$ExternalSyntheticLambda0
            public final /* synthetic */ KeyedStorageContextWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KeyedStorageContextWrapper keyedStorageContextWrapper = this.f$0;
                switch (i2) {
                    case 0:
                        return KeyedStorageContextWrapper.$r8$lambda$bmDZELm0i5Cq7N3_D2O3_CncfjQ(keyedStorageContextWrapper);
                    default:
                        return KeyedStorageContextWrapper.$r8$lambda$bA08Axf3hnIoLixvhVzbSyZ00pE(keyedStorageContextWrapper);
                }
            }
        });
        final int i2 = 1;
        this.filesDirFile$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.storage.context.KeyedStorageContextWrapper$$ExternalSyntheticLambda0
            public final /* synthetic */ KeyedStorageContextWrapper f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KeyedStorageContextWrapper keyedStorageContextWrapper = this.f$0;
                switch (i22) {
                    case 0:
                        return KeyedStorageContextWrapper.$r8$lambda$bmDZELm0i5Cq7N3_D2O3_CncfjQ(keyedStorageContextWrapper);
                    default:
                        return KeyedStorageContextWrapper.$r8$lambda$bA08Axf3hnIoLixvhVzbSyZ00pE(keyedStorageContextWrapper);
                }
            }
        });
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteDatabase(String str) {
        str.getClass();
        try {
            return SQLiteDatabase.deleteDatabase(getDatabasePath(str));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return (File) this.cacheDirFile$delegate.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        str.getClass();
        File parentFile = super.getDatabasePath(str).getParentFile();
        parentFile.getClass();
        File resolve = FilesKt__UtilsKt.resolve(parentFile, this.key);
        resolve.mkdirs();
        return FilesKt__UtilsKt.resolve(resolve, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return (File) this.filesDirFile$delegate.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        str.getClass();
        String str2 = this.key;
        str2.getClass();
        SharedPreferences sharedPreferences = super.getSharedPreferences(str2 + "-" + str, i);
        sharedPreferences.getClass();
        return sharedPreferences;
    }
}
