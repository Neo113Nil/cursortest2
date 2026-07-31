package com.gates.olympus.miruv.data;

import M1.m;
import Z1.i;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    public static final int $stable;
    public static final c INSTANCE = new c();
    private static final List<b> joints;

    static {
        d dVar = d.FRAME;
        b bVar = new b("mortise_tenon", "Mortise & Tenon", dVar, f.MORTISE, 5, 4, "A tenon tongue seated into a matching mortise pocket.", "One of the oldest and strongest woodworking joints. A projecting tenon is cut on the end of one member and fits snugly into a mortise cavity chopped in the other. Glue surface and mechanical interlock make it excellent for framed structures under racking loads.", "Table legs to aprons, chair frames, doors, timber framing.", "Mortise chisel, marking gauge, tenon saw or router.", "Cut the mortise first, then pare the tenon to fit it — it is easier to trim a tenon than to widen a mortise.");
        d dVar2 = d.CARCASS;
        f fVar = f.DOVETAIL;
        b bVar2 = new b("through_dovetail", "Through Dovetail", dVar2, fVar, 5, 5, "Interlocking flared pins and tails visible on both faces.", "The angled tails resist being pulled apart in one direction, giving a mechanical lock that survives even if the glue fails. A hallmark of fine drawer and box work, prized as much for looks as for holding power.", "Drawer sides, blanket chests, fine boxes, cabinet carcasses.", "Dovetail saw, coping saw, sharp bench chisels, marking knife.", "Saw to the waste side of your knife line — you can always pare back to the line, never past it.");
        b bVar3 = new b("half_blind_dovetail", "Half-Blind Dovetail", dVar2, fVar, 5, 5, "Dovetails hidden from the front face of the joint.", "The tails stop short of the show face so the joint is invisible from the front. Traditional for drawer fronts, where you want dovetail strength without seeing end grain on the finished piece.", "Drawer fronts, quality casework where the front must stay clean.", "Dovetail saw, narrow chisels, router with dovetail jig (optional).", "Keep the lap thickness at about one third of the board — enough cover, still strong.");
        b bVar4 = new b("box_finger", "Box (Finger) Joint", dVar2, f.FINGER, 4, 3, "Square interlocking fingers with lots of glue surface.", "A simpler cousin of the dovetail. Straight square fingers alternate between the two boards. It relies on glue rather than an angled lock, but the large long-grain surface makes it very strong and easy to machine repeatably.", "Boxes, drawers, kitchenware, batch-made carcasses.", "Table saw with box-joint jig, or router.", "Dial in your jig on scrap first — finger spacing must match exactly or the corner will not close.");
        d dVar3 = d.QUICK;
        b bVar5 = new b("butt", "Butt Joint", dVar3, f.BUTT, 1, 1, "Two square ends simply meeting, held by fasteners or glue.", "The simplest joint of all: one piece butts against another with no shaping. Weak on its own because it often relies on end-grain glue, so it is normally reinforced with screws, nails, dowels or brackets.", "Rough framing, quick carcasses, anything reinforced.", "Saw, drill, screws or nails.", "End grain drinks glue and gives a weak bond — always add mechanical reinforcement.");
        b bVar6 = new b("mitre", "Mitre Joint", dVar, f.MITRE, 2, 2, "Two 45-degree cuts forming a clean 90-degree corner.", "Hides end grain for a seamless corner, but the mating surfaces are largely end grain so glue alone is weak. Splines, keys or biscuits are usually added to boost the bond and to help alignment.", "Picture frames, trim, moulding, decorative boxes.", "Mitre saw or shooting board, mitre clamps.", "Add a spline or key across the corner — it turns a fragile mitre into a lasting one.");
        b bVar7 = new b("half_lap", "Half-Lap Joint", dVar, f.LAP, 3, 2, "Half the thickness removed from each piece so they overlap flush.", "Each member loses half its thickness where they cross or meet, so they nest flush with a large flat glue surface. Simple, self-registering and much stronger than a butt joint.", "Frames, workbench rails, cross-halvings, jigs.", "Saw, router or dado stack, chisel.", "Sneak up on the depth in light passes so both halves finish dead flush.");
        d dVar4 = d.BOARD;
        joints = m.c0(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b("dado", "Dado Joint", dVar4, f.DADO, 4, 2, "A square channel across the grain holding a shelf end.", "A slot cut across the grain of one board captures the end of another. The walls resist downward load extremely well, which is why it is the classic shelf and divider joint in casework.", "Bookcase shelves, cabinet dividers, drawer runners.", "Router with straight bit, or dado stack on a table saw.", "Cut the dado a hair under plywood thickness and it will grip without slop."), new b("rabbet", "Rabbet (Rebate)", dVar2, f.RABBET, 3, 2, "A step cut along an edge to receive a mating board.", "An L-shaped recess along the edge or end of a board. It registers the mating piece, hides some end grain and adds glue surface — a step up from a butt joint with almost no extra effort.", "Cabinet backs, box corners, seating panels and glass.", "Router, rabbeting bit, or table saw.", "A rabbeted back panel squares the whole carcass — do not skip it."), new b("tongue_groove", "Tongue & Groove", dVar4, f.TONGUE, 3, 3, "A tongue on one edge riding in a matching groove.", "Edge-joins boards so they stay flush while still allowing seasonal movement. Widely used for panels and flooring where a wide, stable surface must span with hidden alignment.", "Flooring, panelling, cabinet backs, table tops.", "Router table, matched bit set, or table saw.", "Leave the tongue slightly loose in the groove so the wood can move without splitting."), new b("bridle", "Bridle Joint", dVar, f.BRIDLE, 4, 3, "An open mortise straddling a full-width tenon.", "Like a mortise and tenon turned inside out — the mortise is open on three sides and the tenon spans its full width. Big glue area and good resistance to twist make it a strong frame corner.", "Frame corners, workbench legs, sash frames.", "Tenon saw, coping saw, chisel or bandsaw.", "Clamp across the cheeks while gluing, or they can bow open under pressure."), new b("dowel", "Dowel Joint", dVar4, f.DOWEL, 3, 2, "Aligned holes pinned with glued hardwood dowels.", "Round dowels register and reinforce two members through matching drilled holes. Cheap and strong when holes align, but accuracy is everything — a dowelling jig makes it repeatable.", "Edge joining, carcass assembly, furniture knock-down.", "Dowel jig, brad-point bits, glue, mallet.", "Flute or groove the dowels so trapped glue and air can escape as you drive them."), new b("pocket_hole", "Pocket-Hole Joint", dVar3, f.POCKET, 3, 1, "An angled screw driven through a drilled pocket.", "A jig drills a steep angled hole so a self-tapping screw pulls two boards tight with no clamping. Fast and forgiving, the go-to for cabinets and face frames when speed matters more than tradition.", "Face frames, cabinets, quick furniture, repairs.", "Pocket-hole jig, stepped bit, driver.", "Match screw length to stock thickness or the tip will blow through the show face."), new b("scarf", "Scarf Joint", d.LENGTHENING, f.SCARF, 4, 4, "Two long tapered ends overlapped to extend length.", "Joins two pieces end to end into one longer member by overlapping matching long bevels. The shallow angle spreads load over a wide glue area, making an almost invisible splice when done well.", "Long mouldings, boat building, timber repair, trim runs.", "Hand plane, shooting board, or tapering jig.", "Aim for a slope around 1 in 8 — the longer the taper, the stronger the splice."), new b("biscuit", "Biscuit Joint", dVar4, f.BISCUIT, 2, 2, "A compressed beech wafer swelling in matched slots.", "A plate joiner cuts crescent slots and an oval beech biscuit glued inside swells with moisture to lock the joint. Mostly an alignment aid for edge joins rather than a heavy structural connector.", "Edge-joining panels, table tops, cabinet alignment.", "Biscuit joiner, glue, clamps.", "Biscuits mainly align — for real strength let the long-grain edge glue do the work."));
        $stable = 8;
    }

    private c() {
    }

    public final b byId(String str) {
        Object obj;
        i.f(str, "id");
        Iterator<T> it = joints.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i.a(((b) obj).getId(), str)) {
                break;
            }
        }
        return (b) obj;
    }

    public final List<b> getJoints() {
        return joints;
    }
}
