package com.crrepa.band.my.device.localphoto.model;

import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.localphoto.l;
import com.crrepa.band.my.device.localphoto.model.LocalImageModel;
import com.crrepa.ble.conn.bean.CRPGalleryInfo;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.g;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class LocalImageModel {
    private static File createAndGetPhotoFile(Uri uri) {
        if (uri == null) {
            return null;
        }
        Cursor query = d.get().getContentResolver().query(uri, null, null, null, null);
        try {
            if (query == null) {
                return null;
            }
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(query.getColumnIndexOrThrow("_size")) <= 0) {
                        return null;
                    }
                    String createAndGetAbsolutePath = g0.createAndGetAbsolutePath(d.get(), uri, getLocalPhotoTemporaryDir() + File.separator + query.getString(query.getColumnIndexOrThrow("_display_name")));
                    StringBuilder sb = new StringBuilder();
                    sb.append("createAndGetAbsolutePath: ");
                    sb.append(createAndGetAbsolutePath);
                    Log.d("LocalImageModel", sb.toString());
                    if (x0.isEmpty(createAndGetAbsolutePath)) {
                        return null;
                    }
                    return new File(createAndGetAbsolutePath);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return null;
        } finally {
            query.close();
        }
    }

    private static List<File> createAndGetPhotoFileList(List<Uri> list) {
        ArrayList arrayList = new ArrayList();
        if (x0.isEmpty(list)) {
            return arrayList;
        }
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            File createAndGetPhotoFile = createAndGetPhotoFile(it.next());
            if (createAndGetPhotoFile != null && createAndGetPhotoFile.exists()) {
                arrayList.add(createAndGetPhotoFile);
            }
        }
        return arrayList;
    }

    public static Observable<Void> deleteUnmatchedFileList() {
        return Observable.create(new ObservableOnSubscribe() { // from class: g1.a
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalImageModel.lambda$deleteUnmatchedFileList$1(observableEmitter);
            }
        });
    }

    @NonNull
    public static String getLocalPhotoDir() {
        return g0.getDirPathByDirName(d.get(), Environment.DIRECTORY_PICTURES, "LocalPhotoTemp");
    }

    @NonNull
    public static String getLocalPhotoTemporaryDir() {
        return g0.getDirPathByDirName(d.get(), Environment.DIRECTORY_PICTURES, "LocalPhotoTemporary");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteUnmatchedFileList$1(ObservableEmitter observableEmitter) {
        List<String> photoList = l.getCRPLocalPhotoInfo().getPhotoList();
        if (x0.isEmpty(photoList)) {
            observableEmitter.onNext((Void) Void.class.newInstance());
            observableEmitter.onComplete();
            return;
        }
        List<File> allFiles = g0.getAllFiles(getLocalPhotoDir());
        ArrayList arrayList = new ArrayList();
        for (String str : photoList) {
            if (!x0.isEmpty(str)) {
                for (File file : allFiles) {
                    if (file.getName().contains(str)) {
                        arrayList.add(file);
                    }
                }
            }
        }
        allFiles.removeAll(arrayList);
        for (File file2 : allFiles) {
            if (file2.exists()) {
                file2.delete();
            }
        }
        observableEmitter.onNext((Void) Void.class.newInstance());
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryAndCreatePhotoFileList$2(List list, ObservableEmitter observableEmitter) {
        List<File> createAndGetPhotoFileList = createAndGetPhotoFileList(list);
        resizePhotoFile(createAndGetPhotoFileList);
        observableEmitter.onNext(createAndGetPhotoFileList);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$querySavedPhotoBeanList$0(ObservableEmitter observableEmitter) {
        List<String> photoList = l.getCRPLocalPhotoInfo().getPhotoList();
        if (x0.isEmpty(photoList)) {
            observableEmitter.onNext(new ArrayList());
            observableEmitter.onComplete();
            return;
        }
        List<File> allFiles = g0.getAllFiles(getLocalPhotoDir());
        ArrayList arrayList = new ArrayList();
        for (String str : photoList) {
            if (!x0.isEmpty(str)) {
                LocalPhotoSavedBean localPhotoSavedBean = new LocalPhotoSavedBean(str);
                arrayList.add(localPhotoSavedBean);
                for (File file : allFiles) {
                    if (file.getName().contains(str)) {
                        localPhotoSavedBean.file = file;
                    }
                }
            }
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    public static Observable<List<File>> queryAndCreatePhotoFileList(final List<Uri> list) {
        return Observable.create(new ObservableOnSubscribe() { // from class: g1.c
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalImageModel.lambda$queryAndCreatePhotoFileList$2(list, observableEmitter);
            }
        });
    }

    public static Observable<List<LocalPhotoSavedBean>> querySavedPhotoBeanList() {
        return Observable.create(new ObservableOnSubscribe() { // from class: g1.b
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalImageModel.lambda$querySavedPhotoBeanList$0(observableEmitter);
            }
        });
    }

    private static void resizePhotoFile(List<File> list) {
        if (x0.isEmpty(list)) {
            return;
        }
        CRPGalleryInfo cRPLocalPhotoInfo = l.getCRPLocalPhotoInfo();
        int width = cRPLocalPhotoInfo.getWidth();
        int height = cRPLocalPhotoInfo.getHeight();
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            resizePhotoFile(it.next(), width, height);
        }
    }

    private static void resizePhotoFile(File file, int i8, int i9) {
        if (file == null || file.length() <= 0 || x0.isEmpty(file.getPath())) {
            return;
        }
        g.changeBitmapSizeAndSave(file.getPath(), Math.min(i8, i9));
    }
}
