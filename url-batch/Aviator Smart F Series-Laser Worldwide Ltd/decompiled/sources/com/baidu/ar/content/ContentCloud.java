package com.baidu.ar.content;

import android.content.Context;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.fa;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.k3;
import com.baidu.ar.o2;
import com.baidu.ar.oa;
import com.baidu.ar.q1;
import com.baidu.ar.x1;
import com.baidu.ar.z1;
import com.baidu.ar.za;
import java.util.List;

/* loaded from: classes.dex */
public class ContentCloud implements IContentPlatform {

    /* renamed from: a, reason: collision with root package name */
    public Context f2002a;

    /* renamed from: b, reason: collision with root package name */
    public ARResourceManager f2003b;

    /* renamed from: c, reason: collision with root package name */
    public o2 f2004c;

    public ContentCloud(Context context) {
        this(context, null);
    }

    @Override // com.baidu.ar.content.IContentPlatform
    public ICancellable checkCaseUpdate(String str, x1 x1Var) {
        return fa.a(new oa(this.f2002a, this.f2004c), new String[]{str, null}).a(new z1(this.f2003b, x1Var));
    }

    @Override // com.baidu.ar.content.IContentPlatform
    public ICancellable downloadCase(String str, IRequestCallback<IARCaseInfo> iRequestCallback, IProgressCallback iProgressCallback) {
        return fa.a(new oa(this.f2002a, this.f2004c), new String[]{str, null}).a(new k3(this.f2003b, iProgressCallback)).a(new q1(iRequestCallback));
    }

    public String getCasePath(String str) {
        return this.f2003b.getCaseDirPath(str);
    }

    public ARResourceManager getResManager() {
        return this.f2003b;
    }

    @Override // com.baidu.ar.content.IContentPlatform
    public ICancellable queryRecommendCases(String str, IRequestCallback<List<IARCaseInfo>> iRequestCallback) {
        return fa.a(new za(this.f2002a), str).a(new q1(iRequestCallback));
    }

    public void release() {
        this.f2002a = null;
        this.f2003b = null;
        this.f2004c = null;
    }

    public ContentCloud(Context context, ARResourceManager aRResourceManager) {
        this.f2002a = context.getApplicationContext();
        if (aRResourceManager == null) {
            this.f2003b = new ARResourceManager(this.f2002a);
        } else {
            this.f2003b = aRResourceManager;
        }
    }

    @Override // com.baidu.ar.content.IContentPlatform
    public ICancellable downloadCase(String str, String str2, IRequestCallback<IARCaseInfo> iRequestCallback, IProgressCallback iProgressCallback) {
        return fa.a(new oa(this.f2002a, this.f2004c), new String[]{str, str2}).a(new k3(this.f2003b, iProgressCallback)).a(new q1(iRequestCallback));
    }

    public ContentCloud(Context context, String str, String str2) {
        this.f2002a = context.getApplicationContext();
        o2 o2Var = new o2();
        this.f2004c = o2Var;
        o2Var.f2872a = str;
        o2Var.f2873b = str2;
        this.f2003b = new ARResourceManager(this.f2002a);
    }
}
