package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.bj;
import com.startapp.sdk.internal.ti;
import com.startapp.sdk.internal.ui;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;

    @TypeInfo(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;

    @TypeInfo(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public final AbsoluteTrackingLink[] a() {
        return this.absoluteTrackingUrls;
    }

    public final ActionTrackingLink[] b() {
        return this.creativeViewUrls;
    }

    public final FractionTrackingLink[] c() {
        return this.fractionTrackingUrls;
    }

    public final ActionTrackingLink[] d() {
        return this.impressionUrls;
    }

    public final ActionTrackingLink[] e() {
        return this.inlineErrorTrackingUrls;
    }

    public final ActionTrackingLink[] f() {
        return this.soundMuteUrls;
    }

    public final ActionTrackingLink[] g() {
        return this.soundUnmuteUrls;
    }

    public final ActionTrackingLink[] h() {
        return this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] i() {
        return this.videoClosedUrls;
    }

    public final ActionTrackingLink[] j() {
        return this.videoPausedUrls;
    }

    public final ActionTrackingLink[] k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] l() {
        return this.videoPostRollClosedUrls;
    }

    public final ActionTrackingLink[] m() {
        return this.videoPostRollImpressionUrls;
    }

    public final ActionTrackingLink[] n() {
        return this.videoResumedUrls;
    }

    public final ActionTrackingLink[] o() {
        return this.videoRewardedUrls;
    }

    public final ActionTrackingLink[] p() {
        return this.videoSkippedUrls;
    }

    public VideoTrackingDetails(ui uiVar) {
        AbsoluteTrackingLink[] absoluteTrackingLinkArr;
        this.isVAST = true;
        this.impressionUrls = a(uiVar.f7713b);
        this.soundMuteUrls = a(uiVar.f7720i);
        this.soundUnmuteUrls = a(uiVar.f7721j);
        this.videoPausedUrls = a(uiVar.f7716e);
        this.videoResumedUrls = a(uiVar.f7717f);
        this.videoSkippedUrls = a(uiVar.f7722k);
        this.videoClosedUrls = a(uiVar.f7719h);
        this.inlineErrorTrackingUrls = a(uiVar.f7712a);
        this.videoClickTrackingUrls = a(uiVar.f7723l);
        ArrayList arrayList = uiVar.f7714c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                bj bjVar = (bj) obj;
                AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
                absoluteTrackingLink.a(bjVar.f6723a);
                if (((Integer) bjVar.f6724b).intValue() != -1) {
                    absoluteTrackingLink.a(((Integer) bjVar.f6724b).intValue());
                }
                absoluteTrackingLink.d();
                absoluteTrackingLink.e();
                arrayList2.add(absoluteTrackingLink);
            }
            absoluteTrackingLinkArr = (AbsoluteTrackingLink[]) arrayList2.toArray(new AbsoluteTrackingLink[0]);
        } else {
            absoluteTrackingLinkArr = new AbsoluteTrackingLink[0];
        }
        this.absoluteTrackingUrls = absoluteTrackingLinkArr;
        ArrayList arrayList3 = uiVar.f7715d;
        ArrayList arrayList4 = uiVar.f7718g;
        ArrayList arrayList5 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            bj bjVar2 = (bj) obj2;
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.a(bjVar2.f6723a);
            fractionTrackingLink.a((int) (((Float) bjVar2.f6724b).floatValue() * 100.0f));
            fractionTrackingLink.d();
            fractionTrackingLink.e();
            arrayList5.add(fractionTrackingLink);
        }
        int size3 = arrayList4.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList4.get(i6);
            i6++;
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.a((String) obj3);
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.d();
            fractionTrackingLink2.e();
            arrayList5.add(fractionTrackingLink2);
        }
        this.fractionTrackingUrls = arrayList5.size() > 0 ? (FractionTrackingLink[]) arrayList5.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
        List list = uiVar.o;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.videoPostRollImpressionUrls = a(((ti) list.get(0)).f7632f);
        this.videoPostRollClickTrackingUrls = a(((ti) list.get(0)).f7631e);
    }

    public static ActionTrackingLink[] a(List list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.a(str);
            actionTrackingLink.d();
            actionTrackingLink.e();
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }
}
