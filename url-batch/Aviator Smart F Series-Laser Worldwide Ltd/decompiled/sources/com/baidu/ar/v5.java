package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.remoteres.IDuMixResLoadTask;

/* loaded from: classes.dex */
public interface v5 {
    boolean isSoDownloadSuccess();

    void prepareEglCore(ICallback iCallback, IProgressCallback iProgressCallback, ICallbackWith<IDuMixResLoadTask> iCallbackWith);

    void release();

    void setBusinessTag(String str);

    void setSoName(String str);

    void setup(Context context);
}
