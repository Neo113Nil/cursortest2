package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.AbstractC1176zf;
import O1.C0715a2;
import O1.C0892k0;
import O1.C1165z4;
import O1.Z;
import android.net.Uri;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.expression.RuntimeStoreProviderKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedSubmitHandler implements DivActionTypedHandler {

    @NotNull
    private final DivRequestExecutor requestExecutor;

    @Metadata
    private static final class ContainerFinder extends DivTreeVisitor<Unit> {

        @NotNull
        private final List<DivItemBuilderResult> containers;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContainerFinder(@NotNull String id) {
            super(null, 1, null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.containers = new ArrayList();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(Z z4, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(z4, bindingContext, divStatePath);
            return Unit.f41027a;
        }

        @Nullable
        public final DivItemBuilderResult findContainer(@NotNull Div2View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C1165z4 divData = view.getDivData();
            if (divData == null) {
                return null;
            }
            for (C1165z4.c cVar : divData.f8711c) {
                visit(cVar.f8721a, view.getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(cVar));
            }
            if (this.containers.isEmpty()) {
                DivActionTypedUtilsKt.logError(view, new RuntimeException("Error resolving container. Elements that respond to id '" + this.id + "' are not found."));
                return null;
            }
            if (this.containers.size() <= 1) {
                return (DivItemBuilderResult) CollectionsKt.first((List) this.containers);
            }
            DivActionTypedUtilsKt.logError(view, new RuntimeException("Error resolving container. Found multiple elements that respond to id '" + this.id + "'."));
            return null;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull Z data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(path, "path");
            if (Intrinsics.areEqual(data.b().getId(), this.id)) {
                this.containers.add(DivCollectionExtensionsKt.toItemBuilderResult(data, context.getExpressionResolver()));
            }
        }
    }

    public DivActionTypedSubmitHandler(@NotNull DivRequestExecutor requestExecutor) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        this.requestExecutor = requestExecutor;
    }

    private final String createBody(DivItemBuilderResult divItemBuilderResult, Div2View div2View) {
        VariableController variableController;
        List f4 = divItemBuilderResult.getDiv().b().f();
        List list = f4;
        if (list == null || list.isEmpty() || (variableController = UtilsKt.getVariableController(divItemBuilderResult.getExpressionResolver())) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = f4.iterator();
        while (it.hasNext()) {
            String name = RuntimeStoreProviderKt.getName((AbstractC1176zf) it.next());
            Object obj = variableController.get(name);
            if ((obj != null ? jSONObject.put(name, obj) : null) == null) {
                DivActionTypedUtilsKt.logError(div2View, new MissingVariableException(name, null, 2, null));
            }
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "body.toString()");
        return jSONObject2;
    }

    private final DivRequestExecutor.Callback createCallback(final List<C0892k0> list, final List<C0892k0> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        List<C0892k0> list3;
        List<C0892k0> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            return null;
        }
        return new DivRequestExecutor.Callback() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler$createCallback$1
        };
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        C0715a2 c4;
        DivItemBuilderResult findContainer;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        ArrayList arrayList = null;
        AbstractC0948n2.t tVar = action instanceof AbstractC0948n2.t ? (AbstractC0948n2.t) action : null;
        if (tVar == null || (c4 = tVar.c()) == null || (findContainer = new ContainerFinder((String) c4.f5589a.evaluate(resolver)).findContainer(view)) == null) {
            return false;
        }
        List list = c4.f5592d.f5598a;
        if (list != null) {
            List<C0715a2.c.C0039c> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (C0715a2.c.C0039c c0039c : list2) {
                arrayList.add(new DivRequestExecutor.Header((String) c0039c.f5605a.evaluate(resolver), (String) c0039c.f5606b.evaluate(resolver)));
            }
        }
        view.addLoadReference(this.requestExecutor.execute(new DivRequestExecutor.Request((Uri) c4.f5592d.f5600c.evaluate(resolver), ((C0715a2.c.d) c4.f5592d.f5599b.evaluate(resolver)).toString(), arrayList, createBody(findContainer, view)), createCallback(c4.f5591c, c4.f5590b, view, resolver)), view);
        return true;
    }
}
