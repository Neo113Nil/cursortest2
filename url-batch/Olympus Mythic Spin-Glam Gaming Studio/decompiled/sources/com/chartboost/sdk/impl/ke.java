package com.chartboost.sdk.impl;

import android.view.View;
import com.chartboost.sdk.impl.je;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ke {
    public final je.a a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public ke(je.a sessionHolder, boolean z) {
        Intrinsics.checkNotNullParameter(sessionHolder, "sessionHolder");
        this.a = sessionHolder;
        this.b = z;
    }

    public final void l() {
        Unit unit;
        if (!this.b) {
            xb.b("OMSDK start session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdSession c = this.a.c();
            if (c != null) {
                c.start();
                xb.a("Omid session started successfully! Version: " + Omid.getVersion(), (Throwable) null, 2, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Omid start session is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void m() {
        if (!this.b) {
            xb.b("OMSDK stop session OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            try {
                AdSession c = this.a.c();
                if (c != null) {
                    c.finish();
                    c.registerAdView(null);
                }
                Omid.updateLastActivity();
                xb.a("Omid session finished!", (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                xb.b("OMSDK stop session exception", e);
            }
            this.a.a((AdSession) null);
            this.a.a((AdEvents) null);
        } catch (Throwable th) {
            this.a.a((AdSession) null);
            this.a.a((AdEvents) null);
            throw th;
        }
    }

    public final void e() {
        try {
            if (this.c) {
                return;
            }
            xb.a("Signal media first quartile", (Throwable) null, 2, (Object) null);
            MediaEvents a = a("signalMediaFirstQuartile");
            if (a != null) {
                a.firstQuartile();
            }
            this.c = true;
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void f() {
        try {
            if (this.d) {
                return;
            }
            xb.a("Signal media midpoint", (Throwable) null, 2, (Object) null);
            MediaEvents a = a("signalMediaMidpoint");
            if (a != null) {
                a.midpoint();
            }
            this.d = true;
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void j() {
        try {
            if (this.e) {
                return;
            }
            xb.a("Signal media third quartile", (Throwable) null, 2, (Object) null);
            MediaEvents a = a("signalMediaThirdQuartile");
            if (a != null) {
                a.thirdQuartile();
            }
            this.e = true;
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void d() {
        try {
            MediaEvents a = a("signalMediaComplete");
            if (a != null) {
                a.complete();
            }
            this.f = true;
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void g() {
        try {
            MediaEvents a = a("signalMediaPause");
            if (a != null) {
                a.pause();
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void h() {
        try {
            MediaEvents a = a("signalMediaResume");
            if (a != null) {
                a.resume();
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void c() {
        try {
            MediaEvents a = a("signalMediaBufferStart");
            if (a != null) {
                a.bufferStart();
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void b() {
        try {
            MediaEvents a = a("signalMediaBufferFinish");
            if (a != null) {
                a.bufferFinish();
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void i() {
        try {
            if (this.g || this.f) {
                return;
            }
            xb.a("Signal media skipped", (Throwable) null, 2, (Object) null);
            MediaEvents a = a("signalMediaSkipped");
            if (a != null) {
                a.skipped();
            }
            this.g = true;
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void k() {
        try {
            MediaEvents a = a("signalUserInteractionClick");
            if (a != null) {
                a.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final MediaEvents a(String str) {
        if (this.a.a() == null) {
            xb.a("MediaEvents are null when executing " + str, (Throwable) null, 2, (Object) null);
        } else {
            xb.a("MediaEvents valid when executing: " + str, (Throwable) null, 2, (Object) null);
        }
        return this.a.a();
    }

    public final void a(View obstructionView) {
        Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
        AdSession c = this.a.c();
        if (c != null) {
            c.addFriendlyObstruction(obstructionView, FriendlyObstructionPurpose.OTHER, "Industry Icon");
        }
    }

    public final void a() {
        Unit unit;
        if (!this.b) {
            xb.b("OMSDK signal impression event OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents b = this.a.b();
            if (b != null) {
                b.impressionOccurred();
                xb.a("Signal om ad event impression occurred!", (Throwable) null, 2, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Omid signal impression event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void a(Integer num) {
        Unit unit;
        VastProperties createVastPropertiesForNonSkippableMedia;
        if (!this.b) {
            xb.b("OMSDK signal load OM is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            AdEvents b = this.a.b();
            if (b != null) {
                boolean z = num != null && num.intValue() > 0;
                if (z) {
                    if (z) {
                        createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : 0.0f, true, Position.STANDALONE);
                    } else {
                        createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    b.loaded(createVastPropertiesForNonSkippableMedia);
                } else {
                    b.loaded();
                }
                xb.a("Signal om ad event loaded!", (Throwable) null, 2, (Object) null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.a("Omid load event is null!", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void a(float f, float f2) {
        this.c = false;
        this.d = false;
        this.e = false;
        try {
            MediaEvents a = a("signalMediaStart duration: " + f + " and volume " + f2);
            if (a != null) {
                a.start(f, f2);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void a(PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        try {
            MediaEvents a = a("signalMediaStateChange state: " + playerState.name());
            if (a != null) {
                a.playerStateChange(playerState);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }

    public final void a(float f) {
        try {
            MediaEvents a = a("signalMediaVolumeChange volume: " + f);
            if (a != null) {
                a.volumeChange(f);
            }
        } catch (Exception e) {
            xb.b("Error", e);
        }
    }
}
