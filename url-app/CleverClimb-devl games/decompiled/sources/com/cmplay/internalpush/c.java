package com.cmplay.internalpush;

import com.cmplay.base.util.webview.ui.WebViewActivity;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.ijinshan.cloudconfig.a;
import java.util.ArrayList;

/* compiled from: CMPPromotionCallBack.java */
/* loaded from: classes.dex */
public class c implements h, a.InterfaceC0372a {

    /* renamed from: a, reason: collision with root package name */
    private l f4180a = null;

    /* renamed from: b, reason: collision with root package name */
    private l f4181b = null;

    @Override // com.cmplay.internalpush.h
    public void a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            arrayList.add("open_screen_scene");
            arrayList.add("section_result_card");
            arrayList.add("section_setting_card");
            arrayList.add("insert_screen_scene");
            arrayList.add("section_family_popup");
            arrayList.add("section_video_distribution");
            arrayList.add("section_small_video");
            arrayList.add("section_small_video_setting");
        }
    }

    @Override // com.cmplay.internalpush.h
    public void b(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            i = 0;
        }
        com.cmplay.base.util.h.a("internal_push", "innerPushJumpToLevel  url:" + str + "   index:" + i);
        NativeUtil.getInstance().jumpToLevel(i);
    }

    @Override // com.cmplay.base.util.b.a
    public boolean a(String str) {
        com.cmplay.base.util.h.a("zzb", "innerPushJumpWebView --> " + str);
        WebViewActivity.StartWebViewActivity(f.r, str, 0);
        return true;
    }

    @Override // com.cmplay.base.util.b.a
    public void a(int i) {
        com.cmplay.base.util.h.a("zzb", "CMPPromotionCallBack.onDataUpdate  sceneType:" + i);
        if (3 == i) {
            if (this.f4180a != null) {
                this.f4180a.a();
            }
            d.a();
        }
        if (5 == i) {
            if (this.f4181b != null) {
                this.f4181b.a();
            }
            d.b();
        }
    }

    @Override // com.ijinshan.cloudconfig.a.InterfaceC0372a
    public void a(String str, int i, String str2, String str3) {
        f.a(com.cmplay.base.util.j.a() + "_cloud_magic", "magic_ver=" + str + "&action=" + i + "&remark=" + str2 + "&error_url=" + str3 + "&reserve1=&reserve2=", true);
    }

    @Override // com.cmplay.base.util.b.a
    public void a(String str, String str2, boolean z) {
        f.a(str, str2, z);
    }
}
