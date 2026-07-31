package com.yandex.div.core.player;

import O1.Bc;
import O1.C0970o6;
import O1.C1013qd;
import O1.C1039s4;
import O1.C1165z4;
import O1.E9;
import O1.Ef;
import O1.G6;
import O1.InterfaceC0752c3;
import O1.R3;
import O1.Z;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivVideoActionHandler {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DivVideoViewMapper videoViewMapper;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivVideoActionHandler(@NotNull DivVideoViewMapper videoViewMapper) {
        Intrinsics.checkNotNullParameter(videoViewMapper, "videoViewMapper");
        this.videoViewMapper = videoViewMapper;
    }

    private final Ef findDivVideoWithId(InterfaceC0752c3 interfaceC0752c3, String str, ExpressionResolver expressionResolver) {
        InterfaceC0752c3 b4;
        Ef findDivVideoWithId;
        if (interfaceC0752c3 instanceof Ef) {
            if (Intrinsics.areEqual(interfaceC0752c3.getId(), str)) {
                return (Ef) interfaceC0752c3;
            }
            return null;
        }
        if (interfaceC0752c3 instanceof C0970o6) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems((C0970o6) interfaceC0752c3, (DivViewFacade) null, expressionResolver)) {
                Ef findDivVideoWithId2 = findDivVideoWithId(divItemBuilderResult.component1().b(), str, divItemBuilderResult.component2());
                if (findDivVideoWithId2 != null) {
                    return findDivVideoWithId2;
                }
            }
            return null;
        }
        if (interfaceC0752c3 instanceof R3) {
            for (DivItemBuilderResult divItemBuilderResult2 : DivCollectionExtensionsKt.buildItems((R3) interfaceC0752c3, (DivViewFacade) null, expressionResolver)) {
                Ef findDivVideoWithId3 = findDivVideoWithId(divItemBuilderResult2.component1().b(), str, divItemBuilderResult2.component2());
                if (findDivVideoWithId3 != null) {
                    return findDivVideoWithId3;
                }
            }
            return null;
        }
        if (interfaceC0752c3 instanceof G6) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems((G6) interfaceC0752c3).iterator();
            while (it.hasNext()) {
                Ef findDivVideoWithId4 = findDivVideoWithId(((Z) it.next()).b(), str, expressionResolver);
                if (findDivVideoWithId4 != null) {
                    return findDivVideoWithId4;
                }
            }
            return null;
        }
        if (interfaceC0752c3 instanceof E9) {
            for (DivItemBuilderResult divItemBuilderResult3 : DivCollectionExtensionsKt.buildItems((E9) interfaceC0752c3, (DivViewFacade) null, expressionResolver)) {
                Ef findDivVideoWithId5 = findDivVideoWithId(divItemBuilderResult3.component1().b(), str, divItemBuilderResult3.component2());
                if (findDivVideoWithId5 != null) {
                    return findDivVideoWithId5;
                }
            }
            return null;
        }
        if (interfaceC0752c3 instanceof C1013qd) {
            Iterator it2 = ((C1013qd) interfaceC0752c3).f7630q.iterator();
            while (it2.hasNext()) {
                Ef findDivVideoWithId6 = findDivVideoWithId(((C1013qd.c) it2.next()).f7643a.b(), str, expressionResolver);
                if (findDivVideoWithId6 != null) {
                    return findDivVideoWithId6;
                }
            }
            return null;
        }
        if (interfaceC0752c3 instanceof C1039s4) {
            List list = ((C1039s4) interfaceC0752c3).f7841q;
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Ef findDivVideoWithId7 = findDivVideoWithId(((Z) it3.next()).b(), str, expressionResolver);
                    if (findDivVideoWithId7 != null) {
                        return findDivVideoWithId7;
                    }
                }
            }
            return null;
        }
        if (interfaceC0752c3 instanceof Bc) {
            Iterator it4 = ((Bc) interfaceC0752c3).f1529y.iterator();
            while (it4.hasNext()) {
                Z z4 = ((Bc.c) it4.next()).f1536c;
                if (z4 != null && (b4 = z4.b()) != null && (findDivVideoWithId = findDivVideoWithId(b4, str, expressionResolver)) != null) {
                    return findDivVideoWithId;
                }
            }
        }
        return null;
    }

    private final Ef searchDivDataForVideo(C1165z4 c1165z4, String str, ExpressionResolver expressionResolver) {
        Iterator it = c1165z4.f8711c.iterator();
        while (it.hasNext()) {
            Ef findDivVideoWithId = findDivVideoWithId(((C1165z4.c) it.next()).f8721a.b(), str, expressionResolver);
            if (findDivVideoWithId != null) {
                return findDivVideoWithId;
            }
        }
        return null;
    }

    public final boolean handleAction(@NotNull Div2View div2View, @NotNull String divId, @NotNull String action, @NotNull ExpressionResolver expressionResolver) {
        Ef searchDivDataForVideo;
        DivPlayer player;
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(divId, "divId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        C1165z4 divData = div2View.getDivData();
        if (divData == null || (searchDivDataForVideo = searchDivDataForVideo(divData, divId, expressionResolver)) == null || (player = this.videoViewMapper.getPlayer(searchDivDataForVideo)) == null) {
            return false;
        }
        if (Intrinsics.areEqual(action, "start")) {
            player.play();
            return true;
        }
        if (Intrinsics.areEqual(action, "pause")) {
            player.pause();
            return true;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("No such video action: " + action);
        }
        return false;
    }
}
