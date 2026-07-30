package com.moyoung.dafit.module.common.imageload;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.liulishuo.filedownloader.k;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.w0;
import com.orhanobut.logger.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import com.squareup.picasso.v;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {
    private static final Map<String, List<ImageView>> pathMap = new HashMap();

    class a extends k {
        final /* synthetic */ int val$placeHolderResId;
        final /* synthetic */ int[] val$resizes;

        a(int i8, int[] iArr) {
            this.val$placeHolderResId = i8;
            this.val$resizes = iArr;
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            String path = aVar.getPath();
            f.d("completed file: " + path);
            List list = (List) c.pathMap.get(path);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c.intoImageView(new File(path), (ImageView) it.next(), this.val$placeHolderResId, this.val$resizes);
                }
            }
            c.pathMap.remove(path);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            Log.d("DownloadListener", "e: " + th.getMessage());
        }

        @Override // com.liulishuo.filedownloader.k
        protected void paused(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void pending(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void progress(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    class b implements Consumer {
        final /* synthetic */ ImageView val$imageView;
        final /* synthetic */ v val$requestCreator;

        class a implements com.squareup.picasso.e {
            a() {
            }

            @Override // com.squareup.picasso.e
            public void onError(Exception exc) {
                exc.printStackTrace();
            }

            @Override // com.squareup.picasso.e
            public void onSuccess() {
            }
        }

        b(v vVar, ImageView imageView) {
            this.val$requestCreator = vVar;
            this.val$imageView = imageView;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            this.val$requestCreator.into(this.val$imageView, new a());
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void intoImageView(File file, ImageView imageView, int i8, int... iArr) {
        if (file == null || !file.exists()) {
            f.d("intoImageView: file is not exists.");
            return;
        }
        v load = Picasso.get().load(file);
        if (iArr != null && iArr.length >= 2) {
            load.resize(iArr[0], iArr[1]).centerCrop();
        }
        if (i8 != 0) {
            load.placeholder(i8);
        }
        intoImageView(load, imageView);
    }

    private static void intoTarget(v vVar, a0 a0Var) {
        vVar.into(a0Var);
    }

    public static void load(ImageView imageView, String str) {
        load(imageView, str, 0, new int[0]);
    }

    public static void load(ImageView imageView, String str, @NonNull File file) {
        load(imageView, str, file, 0, new int[0]);
    }

    public static void load(ImageView imageView, String str, int i8, int... iArr) {
        String fileName = w0.getFileName(str);
        if (TextUtils.isEmpty(fileName)) {
            fileName = str;
        }
        load(imageView, str, new File(g0.getPicturesFilePath(imageView.getContext(), "picasso_cache/" + fileName)), i8, iArr);
    }

    public static void load(ImageView imageView, String str, @NonNull File file, int i8, int... iArr) {
        Picasso picasso = Picasso.get();
        if (file.exists()) {
            intoImageView(picasso.load(file), imageView);
            return;
        }
        String absolutePath = file.getAbsolutePath();
        Map<String, List<ImageView>> map = pathMap;
        List<ImageView> list = map.get(absolutePath);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(imageView);
        map.put(absolutePath, list);
        new com.moyoung.dafit.module.common.imageload.a().donwloadFile(str, absolutePath, new a(i8, iArr));
    }

    @SuppressLint({"CheckResult"})
    private static void intoImageView(v vVar, ImageView imageView) {
        Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(vVar, imageView));
    }
}
