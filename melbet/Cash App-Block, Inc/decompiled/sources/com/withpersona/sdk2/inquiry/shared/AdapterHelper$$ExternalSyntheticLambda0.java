package com.withpersona.sdk2.inquiry.shared;

import androidx.compose.runtime.Composer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.maps.android.clustering.Cluster;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.maps.views.CashCluster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class AdapterHelper$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function3 f$0;

    public /* synthetic */ AdapterHelper$$ExternalSyntheticLambda0(Function3 function3, int i) {
        this.$r8$classId = i;
        this.f$0 = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function3 function3 = this.f$0;
        switch (i) {
            case 0:
                ViewBinding viewBinding = (ViewBinding) obj2;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
                obj.getClass();
                viewBinding.getClass();
                viewHolder.getClass();
                function3.invoke(obj, viewBinding, viewHolder);
                break;
            default:
                Cluster cluster = (Cluster) obj;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                cluster.getClass();
                Collection items = cluster.getItems();
                items.getClass();
                Collection collection = items;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GoogleMapEngine.GoogleClusterItemAdapter) it.next()).cashItem);
                }
                function3.invoke(new CashCluster(arrayList, cluster.getPosition().latitude, cluster.getPosition().longitude), composer, 8);
                break;
        }
        return Unit.INSTANCE;
    }
}
