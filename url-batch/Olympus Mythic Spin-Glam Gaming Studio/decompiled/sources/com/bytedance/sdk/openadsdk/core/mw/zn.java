package com.bytedance.sdk.openadsdk.core.mw;

import android.content.Context;
import com.bytedance.adsdk.ugeno.btk.hhw;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.adsdk.ugeno.fb.nps;
import com.bytedance.adsdk.ugeno.fb.zg;
import com.bytedance.adsdk.ugeno.yoga.YogaNative;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class zn {
    public static void zmn() {
        try {
            System.loadLibrary("tt_ugen_layout");
            int i = YogaNative.$r8$clinit;
        } catch (Throwable unused) {
        }
    }

    public static void zmn(Context context) {
        com.bytedance.adsdk.ugeno.btk.zmn().zmn(context, new com.bytedance.adsdk.ugeno.core.zn() { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1
            @Override // com.bytedance.adsdk.ugeno.core.zn
            public List<com.bytedance.adsdk.ugeno.core.fs> zmn() {
                ArrayList arrayList = new ArrayList();
                String str = "Lottie";
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs(str) { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.1
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("Logo") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.12
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.btk(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("CommentNum") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.23
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.zmn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("View") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.24
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.yoga.fs.zmn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("CustomComponent") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.25
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.yoga.fs.zmn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("Text") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.26
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.bvs.hhw.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("Image") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.27
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.bvs.fb.zn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("FlexLayout") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.28
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new hhw(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("FrameLayout") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.29
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.bvs.fs.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("RatingBar") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.2
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.bvs.btk.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("RatingStar") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.3
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.bvs.btk.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("Button") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.4
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.bvs.zmn.zmn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs(VastTagName.VIDEO) { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.5
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.hhw.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("VideoV3") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.6
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.hhw.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs(str) { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.7
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("Swiper") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.8
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.zn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs(k.C) { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.9
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fb(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("FVCountdown") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.10
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("RVCountdown") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.11
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("FVSkipView") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.13
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.hhw(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("RVSkipView") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.14
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.hhw(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("AOSkipView") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.15
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.hhw(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("AOCountdown") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.16
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("PlayableComponent") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.17
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.zn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("SwiperView") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.18
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("SlideView") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.19
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.btk.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("Playable") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.20
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.zn.fs(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("ProgressBar") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.21
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fb.zn(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.fs("FlipDown") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.1.22
                    @Override // com.bytedance.adsdk.ugeno.core.fs
                    public com.bytedance.adsdk.ugeno.fs.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.zmn.fs(context2);
                    }
                });
                return arrayList;
            }
        }, new zmn());
        com.bytedance.adsdk.ugeno.btk.zmn().zmn(new zg() { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2
            @Override // com.bytedance.adsdk.ugeno.fb.zg
            public List<nps> zmn() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new nps("SwiperView://slide") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.1
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.fb.fb.zg(context2);
                    }
                });
                arrayList.add(new nps("SwiperView://finish") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.3
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.fb.fb.hhw(context2);
                    }
                });
                arrayList.add(new nps("SwiperView://reloop") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.4
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.fb.fb.nps(context2);
                    }
                });
                arrayList.add(new nps("renderDidFinish") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.5
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.fb.fb.zmn(context2);
                    }
                });
                arrayList.add(new nps("Lottie://state") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.6
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.btk.fs.fs(context2);
                    }
                });
                arrayList.add(new nps("videoProgress") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.7
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.btk.fs.fb(context2);
                    }
                });
                arrayList.add(new nps("videoFail") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.8
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.btk.fs.zn(context2);
                    }
                });
                arrayList.add(new nps("show") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.9
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.adsdk.ugeno.fb.fb.zmn(context2);
                    }
                });
                arrayList.add(new nps("ProgressBar://progress") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.10
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.fs.fb.fs(context2);
                    }
                });
                arrayList.add(new nps("countdown") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.2.2
                    @Override // com.bytedance.adsdk.ugeno.fb.nps
                    public com.bytedance.adsdk.ugeno.fb.fb.zn zmn(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.mw.btk.fs.zmn(context2);
                    }
                });
                return arrayList;
            }
        });
        com.bytedance.adsdk.ugeno.btk.zmn().zmn(new com.bytedance.adsdk.ugeno.fb.zn() { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3
            @Override // com.bytedance.adsdk.ugeno.fb.zn
            public List<com.bytedance.adsdk.ugeno.fb.fs> zmn() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("swiperNext") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.1
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.zn.zmn(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("swiperPrevious") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.2
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.zn.zn(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("swiperPosition") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.3
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.zn.fs(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("speedVideoOrTimer") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.4
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.fs.zn(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("openLinks") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.5
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.fs.zn(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("sendLogExtra") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.6
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.fs.zn(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("sendAdExtra") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.7
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.adsdk.ugeno.fb.fs.zn(znVar, str, zmnVar);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.fb.fs("Lottie://start") { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.3.8
                    @Override // com.bytedance.adsdk.ugeno.fb.fs
                    public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                        return new com.bytedance.sdk.openadsdk.core.mw.btk.zmn.zmn(znVar, str, zmnVar);
                    }
                });
                return arrayList;
            }
        });
        com.bytedance.adsdk.ugeno.btk.zmn().zmn(new com.bytedance.adsdk.zmn.zn());
    }
}
