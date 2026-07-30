package com.chicken.road.kedbags.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import com.chicken.road.kedbags.data.model.EggStatus;
import com.chicken.road.kedbags.data.model.TreasureEgg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: TreasureRepository.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0011J\u0016\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011J$\u0010'\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00112\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120)H\u0002J\u001c\u0010*\u001a\u00020\u001e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006+"}, d2 = {"Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "eggs", "", "Lcom/chicken/road/kedbags/data/model/TreasureEgg;", "getEggs", "()Ljava/util/List;", "_statuses", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/chicken/road/kedbags/data/model/EggStatus;", "statuses", "Lkotlinx/coroutines/flow/StateFlow;", "getStatuses", "()Lkotlinx/coroutines/flow/StateFlow;", "_quizScore", "quizScore", "getQuizScore", "loadStatuses", "statusFor", "id", "togglePinned", "", "setExplored", "explored", "", "setNote", "note", "", "saveQuizScore", "score", "updateStatus", "transform", "Lkotlin/Function1;", "persist", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TreasureRepository {
    public static final int $stable = 8;
    private final MutableStateFlow<Integer> _quizScore;
    private final MutableStateFlow<Map<Integer, EggStatus>> _statuses;
    private final List<TreasureEgg> eggs;
    private final SharedPreferences prefs;
    private final StateFlow<Integer> quizScore;
    private final StateFlow<Map<Integer, EggStatus>> statuses;

    public TreasureRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("cluck_fortune_state", 0);
        this.prefs = sharedPreferences;
        this.eggs = CollectionsKt.listOf((Object[]) new TreasureEgg[]{new TreasureEgg(1, "Amber Yolk Milepost", "Road Relics", "Route clue 1: follow the warm coin glint past marker 3.", "Amber Yolk Milepost is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band B", 1901, 2, "Mile 2.1", "Keep the shell bright and the road kind.", 4293481504L, "C"), new TreasureEgg(2, "Cinder Coop Crown", "Ember Nests", "Route clue 2: follow the warm coin glint past marker 6.", "Cinder Coop Crown is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band C", 1902, 3, "Mile 4.2", "Keep the shell bright and the road kind.", 4279592408L, "R"), new TreasureEgg(3, "Blue Token Brooder", "Coin Rings", "Route clue 3: follow the warm coin glint past marker 9.", "Blue Token Brooder is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band D", 1903, 4, "Mile 6.3", "Keep the shell bright and the road kind.", 4280858156L, "L"), new TreasureEgg(4, "Sunfat Shell Cache", "Lucky Shells", "Route clue 4: follow the warm coin glint past marker 12.", "Sunfat Shell Cache is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band E", 1904, 5, "Mile 8.4", "Keep the shell bright and the road kind.", 4294957402L, "B"), new TreasureEgg(5, "Vault Hen Aureole", "Brood Vaults", "Route clue 5: follow the warm coin glint past marker 15.", "Vault Hen Aureole is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band A", 1905, 1, "Mile 10.5", "Keep the shell bright and the road kind.", 4294950656L, "E"), new TreasureEgg(6, "Flarefeather Toll Egg", "Ember Nests", "Route clue 6: follow the warm coin glint past marker 18.", "Flarefeather Toll Egg is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band B", 1906, 2, "Mile 12.6", "Keep the shell bright and the road kind.", 4293481504L, "C"), new TreasureEgg(7, "Old Spur Coinnest", "Coin Rings", "Route clue 7: follow the warm coin glint past marker 21.", "Old Spur Coinnest is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band C", 1907, 3, "Mile 14.7", "Keep the shell bright and the road kind.", 4279592408L, "R"), new TreasureEgg(8, "Lucky Beak Beacon", "Lucky Shells", "Route clue 8: follow the warm coin glint past marker 24.", "Lucky Beak Beacon is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band D", 1908, 4, "Mile 16.8", "Keep the shell bright and the road kind.", 4280858156L, "L"), new TreasureEgg(9, "Cobble Rooster Relic", "Road Relics", "Route clue 9: follow the warm coin glint past marker 27.", "Cobble Rooster Relic is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band E", 1909, 5, "Mile 18.9", "Keep the shell bright and the road kind.", 4294957402L, "B"), new TreasureEgg(10, "Broodbank Gilded Orb", "Brood Vaults", "Route clue 10: follow the warm coin glint past marker 30.", "Broodbank Gilded Orb is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band A", 1910, 1, "Mile 20.0", "Keep the shell bright and the road kind.", 4294950656L, "E"), new TreasureEgg(11, "Ashwing Nest Prize", "Ember Nests", "Route clue 11: follow the warm coin glint past marker 33.", "Ashwing Nest Prize is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band B", 1911, 2, "Mile 22.1", "Keep the shell bright and the road kind.", 4293481504L, "C"), new TreasureEgg(12, "Ringroad Penny Shell", "Coin Rings", "Route clue 12: follow the warm coin glint past marker 36.", "Ringroad Penny Shell is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band C", 1912, 3, "Mile 24.2", "Keep the shell bright and the road kind.", 4279592408L, "R"), new TreasureEgg(13, "Green Chip Hatchling", "Lucky Shells", "Route clue 13: follow the warm coin glint past marker 39.", "Green Chip Hatchling is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band D", 1913, 4, "Mile 26.3", "Keep the shell bright and the road kind.", 4280858156L, "L"), new TreasureEgg(14, "Lantern Lane Ovum", "Road Relics", "Route clue 14: follow the warm coin glint past marker 42.", "Lantern Lane Ovum is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band E", 1914, 5, "Mile 28.4", "Keep the shell bright and the road kind.", 4294957402L, "B"), new TreasureEgg(15, "Deep Roost Reserve", "Brood Vaults", "Route clue 15: follow the warm coin glint past marker 45.", "Deep Roost Reserve is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band A", 1915, 1, "Mile 30.5", "Keep the shell bright and the road kind.", 4294950656L, "E"), new TreasureEgg(16, "Firestraw Fortune Egg", "Ember Nests", "Route clue 16: follow the warm coin glint past marker 48.", "Firestraw Fortune Egg is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band B", 1916, 2, "Mile 32.6", "Keep the shell bright and the road kind.", 4293481504L, "C"), new TreasureEgg(17, "Orbit Coin Clutch", "Coin Rings", "Route clue 17: follow the warm coin glint past marker 51.", "Orbit Coin Clutch is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band C", 1917, 3, "Mile 34.7", "Keep the shell bright and the road kind.", 4279592408L, "R"), new TreasureEgg(18, "Bright Comb Keepsake", "Lucky Shells", "Route clue 18: follow the warm coin glint past marker 54.", "Bright Comb Keepsake is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band D", 1918, 4, "Mile 36.8", "Keep the shell bright and the road kind.", 4280858156L, "L"), new TreasureEgg(19, "Paver Hen Token", "Road Relics", "Route clue 19: follow the warm coin glint past marker 57.", "Paver Hen Token is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band E", 1919, 5, "Mile 38.9", "Keep the shell bright and the road kind.", 4294957402L, "B"), new TreasureEgg(20, "Granary Vault Shell", "Brood Vaults", "Route clue 20: follow the warm coin glint past marker 60.", "Granary Vault Shell is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band A", 1920, 1, "Mile 40.0", "Keep the shell bright and the road kind.", 4294950656L, "E"), new TreasureEgg(21, "Sparkside Brood Gem", "Ember Nests", "Route clue 21: follow the warm coin glint past marker 63.", "Sparkside Brood Gem is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band B", 1921, 2, "Mile 42.1", "Keep the shell bright and the road kind.", 4293481504L, "C"), new TreasureEgg(22, "Doubloon Feather Egg", "Coin Rings", "Route clue 22: follow the warm coin glint past marker 66.", "Doubloon Feather Egg is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band C", 1922, 3, "Mile 44.2", "Keep the shell bright and the road kind.", 4279592408L, "R"), new TreasureEgg(23, "Charmgrass Shell", "Lucky Shells", "Route clue 23: follow the warm coin glint past marker 69.", "Charmgrass Shell is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band D", 1923, 4, "Mile 46.3", "Keep the shell bright and the road kind.", 4280858156L, "L"), new TreasureEgg(24, "Milestone Golden Brood", "Road Relics", "Route clue 24: follow the warm coin glint past marker 72.", "Milestone Golden Brood is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band E", 1924, 5, "Mile 48.4", "Keep the shell bright and the road kind.", 4294957402L, "B"), new TreasureEgg(25, "Hidden Perch Bullion", "Brood Vaults", "Route clue 25: follow the warm coin glint past marker 75.", "Hidden Perch Bullion is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band A", 1925, 1, "Mile 50.5", "Keep the shell bright and the road kind.", 4294950656L, "E"), new TreasureEgg(26, "Flame Alley Ovum", "Ember Nests", "Route clue 26: follow the warm coin glint past marker 78.", "Flame Alley Ovum is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band B", 1926, 2, "Mile 52.6", "Keep the shell bright and the road kind.", 4293481504L, "C"), new TreasureEgg(27, "Copper Ring Rooster", "Coin Rings", "Route clue 27: follow the warm coin glint past marker 81.", "Copper Ring Rooster is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band C", 1927, 3, "Mile 54.7", "Keep the shell bright and the road kind.", 4279592408L, "R"), new TreasureEgg(28, "Crosswalk Clover Egg", "Lucky Shells", "Route clue 28: follow the warm coin glint past marker 84.", "Crosswalk Clover Egg is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band D", 1928, 4, "Mile 56.8", "Keep the shell bright and the road kind.", 4280858156L, "L"), new TreasureEgg(29, "Stonegate Hen Mark", "Road Relics", "Route clue 29: follow the warm coin glint past marker 87.", "Stonegate Hen Mark is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band E", 1929, 5, "Mile 58.9", "Keep the shell bright and the road kind.", 4294957402L, "B"), new TreasureEgg(30, "Royal Brood Sunseed", "Brood Vaults", "Route clue 30: follow the warm coin glint past marker 90.", "Royal Brood Sunseed is a road-charm egg said to appear when chicken tracks cross old treasure dust. Keepers record its glow before sunrise and trade the tale at safe coop stops.", "Band A", 1930, 1, "Mile 60.0", "Keep the shell bright and the road kind.", 4294950656L, "E")});
        MutableStateFlow<Map<Integer, EggStatus>> MutableStateFlow = StateFlowKt.MutableStateFlow(loadStatuses());
        this._statuses = MutableStateFlow;
        this.statuses = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Integer.valueOf(sharedPreferences.getInt("quiz_score", 0)));
        this._quizScore = MutableStateFlow2;
        this.quizScore = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final List<TreasureEgg> getEggs() {
        return this.eggs;
    }

    public final StateFlow<Map<Integer, EggStatus>> getStatuses() {
        return this.statuses;
    }

    public final StateFlow<Integer> getQuizScore() {
        return this.quizScore;
    }

    private final Map<Integer, EggStatus> loadStatuses() {
        Set<String> stringSet = this.prefs.getStringSet("pinned_ids", SetsKt.emptySet());
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringSet) {
            Intrinsics.checkNotNull(str);
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        Set<String> stringSet2 = this.prefs.getStringSet("explored_ids", SetsKt.emptySet());
        if (stringSet2 == null) {
            stringSet2 = SetsKt.emptySet();
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : stringSet2) {
            Intrinsics.checkNotNull(str2);
            Integer intOrNull2 = StringsKt.toIntOrNull(str2);
            if (intOrNull2 != null) {
                arrayList2.add(intOrNull2);
            }
        }
        Set set2 = CollectionsKt.toSet(arrayList2);
        List<TreasureEgg> list = this.eggs;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (TreasureEgg treasureEgg : list) {
            Integer valueOf = Integer.valueOf(treasureEgg.getId());
            int id = treasureEgg.getId();
            boolean contains = set.contains(Integer.valueOf(treasureEgg.getId()));
            boolean contains2 = set2.contains(Integer.valueOf(treasureEgg.getId()));
            String str3 = "";
            String string = this.prefs.getString("note_" + treasureEgg.getId(), "");
            if (string != null) {
                str3 = string;
            }
            Pair pair = TuplesKt.to(valueOf, new EggStatus(id, contains, contains2, str3));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final EggStatus statusFor(int id) {
        EggStatus eggStatus = this._statuses.getValue().get(Integer.valueOf(id));
        return eggStatus == null ? new EggStatus(id, false, false, null, 14, null) : eggStatus;
    }

    static final EggStatus togglePinned$lambda$3(EggStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return EggStatus.copy$default(it, 0, !it.getPinned(), false, null, 13, null);
    }

    public final void togglePinned(int id) {
        updateStatus(id, new Function1() { // from class: com.chicken.road.kedbags.data.repository.TreasureRepository$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreasureRepository.togglePinned$lambda$3((EggStatus) obj);
            }
        });
    }

    static final EggStatus setExplored$lambda$4(boolean z, EggStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return EggStatus.copy$default(it, 0, false, z, null, 11, null);
    }

    public final void setExplored(int id, final boolean explored) {
        updateStatus(id, new Function1() { // from class: com.chicken.road.kedbags.data.repository.TreasureRepository$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreasureRepository.setExplored$lambda$4(explored, (EggStatus) obj);
            }
        });
    }

    static final EggStatus setNote$lambda$5(String str, EggStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return EggStatus.copy$default(it, 0, false, false, str, 7, null);
    }

    public final void setNote(int id, final String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        updateStatus(id, new Function1() { // from class: com.chicken.road.kedbags.data.repository.TreasureRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreasureRepository.setNote$lambda$5(note, (EggStatus) obj);
            }
        });
    }

    public final void saveQuizScore(int score) {
        this.prefs.edit().putInt("quiz_score", score).apply();
        this._quizScore.setValue(Integer.valueOf(score));
    }

    private final void updateStatus(int id, Function1<? super EggStatus, EggStatus> transform) {
        Map<Integer, EggStatus> mutableMap = MapsKt.toMutableMap(this._statuses.getValue());
        Integer valueOf = Integer.valueOf(id);
        EggStatus eggStatus = mutableMap.get(Integer.valueOf(id));
        if (eggStatus == null) {
            eggStatus = new EggStatus(id, false, false, null, 14, null);
        }
        mutableMap.put(valueOf, transform.invoke(eggStatus));
        persist(mutableMap);
        this._statuses.setValue(mutableMap);
    }

    private final void persist(Map<Integer, EggStatus> statuses) {
        SharedPreferences.Editor edit = this.prefs.edit();
        Collection<EggStatus> values = statuses.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((EggStatus) obj).getPinned()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(String.valueOf(((EggStatus) it.next()).getEggId()));
        }
        SharedPreferences.Editor putStringSet = edit.putStringSet("pinned_ids", CollectionsKt.toSet(arrayList3));
        Collection<EggStatus> values2 = statuses.values();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : values2) {
            if (((EggStatus) obj2).getExplored()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(String.valueOf(((EggStatus) it2.next()).getEggId()));
        }
        putStringSet.putStringSet("explored_ids", CollectionsKt.toSet(arrayList6)).apply();
        for (EggStatus eggStatus : statuses.values()) {
            this.prefs.edit().putString("note_" + eggStatus.getEggId(), eggStatus.getNote()).apply();
        }
    }
}
