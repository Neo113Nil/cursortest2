package T0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.J;
import com.google.android.material.button.MaterialButton;
import com.winpower.neonfit.DashboardActivity;
import com.winpower.neonfit.FoodLogActivity;
import com.winpower.neonfit.R;
import com.winpower.neonfit.data.DailyTotals;
import com.winpower.neonfit.data.FoodEntry;
import com.winpower.neonfit.data.NutritionRepository;
import com.winpower.neonfit.ui.MacroRingView;
import h.AbstractActivityC0132i;
import java.util.List;
import r1.AbstractC0369t;

/* loaded from: classes.dex */
public final class g implements u1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f1167b;

    public /* synthetic */ g(AbstractActivityC0132i abstractActivityC0132i, int i) {
        this.f1166a = i;
        this.f1167b = abstractActivityC0132i;
    }

    @Override // u1.c
    public final Object emit(Object obj, a1.d dVar) {
        W0.i iVar = W0.i.f1345a;
        AbstractActivityC0132i abstractActivityC0132i = this.f1167b;
        switch (this.f1166a) {
            case 0:
                DailyTotals dailyTotals = (DailyTotals) obj;
                int calories = dailyTotals.getCalories();
                float protein = dailyTotals.getProtein();
                float fat = dailyTotals.getFat();
                float carbs = dailyTotals.getCarbs();
                int i = DashboardActivity.f2596A;
                DashboardActivity dashboardActivity = (DashboardActivity) abstractActivityC0132i;
                int dailyCalorieGoal = ((NutritionRepository) dashboardActivity.f2598z.a()).getUserPreferences().getDailyCalorieGoal();
                int i2 = dailyCalorieGoal - calories;
                int i3 = i2 >= 0 ? i2 : 0;
                dashboardActivity.t().f1243k.setText(dashboardActivity.getString(R.string.calories_today) + "\n" + dashboardActivity.getString(R.string.kcal_format, Integer.valueOf(calories)));
                dashboardActivity.t().f1245m.setText(dashboardActivity.getString(R.string.remaining) + "\n" + dashboardActivity.getString(R.string.remaining_format, Integer.valueOf(i3)));
                dashboardActivity.t().f1244l.setText(dashboardActivity.getString(R.string.goal) + "\n" + dashboardActivity.getString(R.string.kcal_format, Integer.valueOf(dailyCalorieGoal)));
                dashboardActivity.t().f1241g.setConsumed(calories);
                dashboardActivity.t().f1241g.setGoal(dailyCalorieGoal);
                dashboardActivity.t().j.setConsumed(protein);
                MacroRingView macroRingView = dashboardActivity.t().j;
                W0.g gVar = dashboardActivity.f2598z;
                macroRingView.setTarget(((NutritionRepository) gVar.a()).getUserPreferences().getProteinGoal());
                dashboardActivity.t().i.setConsumed(fat);
                dashboardActivity.t().i.setTarget(((NutritionRepository) gVar.a()).getUserPreferences().getFatGoal());
                dashboardActivity.t().f1242h.setConsumed(carbs);
                dashboardActivity.t().f1242h.setTarget(((NutritionRepository) gVar.a()).getUserPreferences().getCarbGoal());
                return iVar;
            default:
                List<FoodEntry> list = (List) obj;
                int i4 = FoodLogActivity.f2599A;
                final FoodLogActivity foodLogActivity = (FoodLogActivity) abstractActivityC0132i;
                foodLogActivity.t().f1248c.removeAllViews();
                foodLogActivity.t().f1249d.setVisibility(list.isEmpty() ? 0 : 8);
                LayoutInflater from = LayoutInflater.from(foodLogActivity);
                for (final FoodEntry foodEntry : list) {
                    View inflate = from.inflate(R.layout.item_food_entry, (ViewGroup) foodLogActivity.t().f1248c, false);
                    int i5 = R.id.btnDelete;
                    MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnDelete);
                    if (materialButton != null) {
                        i5 = R.id.tvEntryMacros;
                        TextView textView = (TextView) H1.d.z(inflate, R.id.tvEntryMacros);
                        if (textView != null) {
                            i5 = R.id.tvEntryTitle;
                            TextView textView2 = (TextView) H1.d.z(inflate, R.id.tvEntryTitle);
                            if (textView2 != null) {
                                textView2.setText(foodLogActivity.getString(R.string.entry_format, foodEntry.getName(), Integer.valueOf(foodEntry.getCalories())));
                                textView.setText(foodLogActivity.getString(R.string.macro_format, Float.valueOf(foodEntry.getProtein()), Float.valueOf(foodEntry.getFat()), Float.valueOf(foodEntry.getCarbs())));
                                materialButton.setOnClickListener(new View.OnClickListener() { // from class: T0.j
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = FoodLogActivity.f2599A;
                                        FoodLogActivity foodLogActivity2 = FoodLogActivity.this;
                                        AbstractC0369t.h(J.e(foodLogActivity2), null, new l(foodLogActivity2, foodEntry, null), 3);
                                    }
                                });
                                foodLogActivity.t().f1248c.addView((LinearLayout) inflate);
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                    break;
                }
                return iVar;
        }
    }
}
