package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class hs0 implements t70<tq0> {
    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(tq0 tq0Var, Map map) {
        tq0 tq0Var2 = tq0Var;
        bv0 p7 = tq0Var2.p();
        if (p7 == null) {
            try {
                bv0 bv0Var = new bv0(tq0Var2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                tq0Var2.x(bv0Var);
                p7 = bv0Var;
            } catch (NullPointerException e7) {
                e = e7;
                io0.e("Unable to parse videoMeta message.", e);
                y2.t.p().s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e8) {
                e = e8;
                io0.e("Unable to parse videoMeta message.", e);
                y2.t.p().s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i7 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i7 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (io0.j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i7);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            io0.b(sb.toString());
        }
        p7.t6(parseFloat2, parseFloat, i7, equals, parseFloat3);
    }
}
