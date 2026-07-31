package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.ai;
import com.startapp.sdk.internal.bi;
import com.startapp.sdk.internal.ii;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
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

    public VideoTrackingDetails(bi biVar) {
        AbsoluteTrackingLink[] absoluteTrackingLinkArr;
        this.isVAST = true;
        this.impressionUrls = a(biVar.b);
        this.soundMuteUrls = a(biVar.i);
        this.soundUnmuteUrls = a(biVar.j);
        this.videoPausedUrls = a(biVar.e);
        this.videoResumedUrls = a(biVar.f);
        this.videoSkippedUrls = a(biVar.k);
        this.videoClosedUrls = a(biVar.h);
        this.inlineErrorTrackingUrls = a(biVar.f188a);
        this.videoClickTrackingUrls = a(biVar.l);
        ArrayList arrayList = biVar.c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ii iiVar = (ii) obj;
                AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
                absoluteTrackingLink.a(iiVar.f279a);
                if (((Integer) iiVar.b).intValue() != -1) {
                    absoluteTrackingLink.a(((Integer) iiVar.b).intValue());
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
        ArrayList arrayList3 = biVar.d;
        ArrayList arrayList4 = biVar.g;
        ArrayList arrayList5 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            ii iiVar2 = (ii) obj2;
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.a(iiVar2.f279a);
            fractionTrackingLink.a((int) (((Float) iiVar2.b).floatValue() * 100.0f));
            fractionTrackingLink.d();
            fractionTrackingLink.e();
            arrayList5.add(fractionTrackingLink);
        }
        int size3 = arrayList4.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList4.get(i3);
            i3++;
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.a((String) obj3);
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.d();
            fractionTrackingLink2.e();
            arrayList5.add(fractionTrackingLink2);
        }
        this.fractionTrackingUrls = arrayList5.size() > 0 ? (FractionTrackingLink[]) arrayList5.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
        List list = biVar.o;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.videoPostRollImpressionUrls = a(((ai) list.get(0)).f);
        this.videoPostRollClickTrackingUrls = a(((ai) list.get(0)).e);
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
